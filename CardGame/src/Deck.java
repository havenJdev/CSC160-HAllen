import java.util.Random;

public class Deck {
	public Card[] cards;
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
        Deck sub = new Deck(end - start + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[start + i];
        }
        return sub;
	}
	
	
	//Hey, I wrote a program that visualized sorts graphically for my 119 final. Fun!
	public void selectionSort() {
		int len = this.cards.length;
		
		//Loop over each element of array except the last (because the last will always end up being the biggest)
		for(int i = 0; i < len-1; i++) {
			//Assume the index at which the smallest value exists is i
			int least = i;
			//Loop over each element of the array starting at i+1
			for(int j = i+1; j < len; j++) {
				//If the card at idx j < card at idx least
				if(this.cards[j].compareTo(this.cards[least]) == -1) {
					//We found the index of our new smallest card. Update least
					least = j;
				}
			}
			//basic swap
			swap(least,i);
		}
	}
	
	public void insertionSort() {
		int len = this.cards.length;
		for(int i = 1; i < len; ++i) {
			Card iCard = this.cards[i];
			int j = i - 1;
			while(j > -1 && this.cards[j].compareTo(iCard) > 0) {
				this.cards[j+1] = this.cards[j];
				j--;
			}
			
			this.cards[j+1] = iCard;
		}
	}
}
