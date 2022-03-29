import java.util.Random;

public class Deck {
	private Card[] cards;
	private Random random = new Random();
	
	public Deck() {
		cards = new Card[52];
		for(int i = 0; i < Card.SUITS.length; i++) {
			for(int j = 1; j < Card.RANKS.length; j++) {
				cards[i*13+j-1] = new Card(j,i);
			}
		}
	}
	
	public Deck(int size) {
		cards = new Card[size];	
	}
	
	public Card[] getCards() {
		return this.cards;
	}
	
	public String tostring() {
		StringBuilder sb = new StringBuilder();
		for(Card card : cards) {
			sb.append(card.toString());
			sb.append(", ");
		}
		return sb.toString();
	}
	
	private void swap(int first, int second) {
		Card temp = this.cards[first];
		this.cards[first] = this.cards[second];
		this.cards[second] = temp;
	}
	
	public void shuffle() {
		for(int i = 0; i < this.cards.length; i++) {
			int cardToSwap = random.nextInt(0, this.cards.length);
			swap(i,cardToSwap);
		}
	}
	
	public Deck subDeck(int start, int end) {
		int len = end - start;
		Deck subbed = new Deck(len);
		int n = 0;
		for(int i = start; i < end; i++) {
			subbed.cards[n] = this.cards[i];
			n++;
		}
		return subbed;
	}
	
	//Hey, I wrote a program that visualized selection sort graphically for my 119 final. Fun!
	public void selectionSort() {
		int len = this.cards.length;
		
		//Loop over each element of array except the last (because the last will always end up being the biggest)
		for(int i = 0; i < len-1; i++) {
			//Assume the index at which the smallest value exists is i
			int min_index = i;
			//Loop over each element of the array starting at i+1
			for(int j = i+1; j < len; j++) {
				//If the card at idx j < card at idx min_index
				if(this.cards[j].compareTo(this.cards[min_index]) == -1) {
					//We found the index of our new smallest card. Update min_index
					min_index = j;
				}
			}
			//basic swap
			swap(min_index,i);
		}
	}
}
