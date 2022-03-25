public class Deck {
	private Card[] cards;
	
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
	
	public String tostring() {
		StringBuilder sb = new StringBuilder();
		for(Card card : cards) {
			sb.append(card.toString());
		}
		return sb.toString();
	}
}
