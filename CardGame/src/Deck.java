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
		Card temp;
		temp = this.cards[first];
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
}
