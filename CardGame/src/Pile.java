import java.util.ArrayList;

public class Pile {
	private ArrayList<Card> cards;
	
	public Pile() {
		cards = new ArrayList<>();
	}
	
	public Card popCard() {
		return cards.remove(0);
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	public void addDeck(Deck deck) {
		for(Card card : deck.getCards()) {
			this.addCard(card);
		}
	}
	
	public String tostring() {
		StringBuilder sb = new StringBuilder();
		for(Card card : cards) {
			sb.append(card.toString());
			sb.append(", ");
		}
		return sb.toString();
	}
}
