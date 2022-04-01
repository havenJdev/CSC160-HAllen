
public class War {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Pile pile1 = new Pile();
		pile1.addDeck(deck.subDeck(0, 25));
		Pile pile2 = new Pile();
		pile2.addDeck(deck.subDeck(26,51));

		System.out.println(pile1.cards.size());
		System.out.println(pile2.cards.size());
				
		System.out.println("Running");
		
		int turns = 0;
		
		/*
		 *  I don't think this game will ever complete if it is played like this
		 *  Every 52^n or so turns, where n = turns / 52, the 2 piles will move closer
		 *  towards being in an order where they just alternate back and forth
		 *  between winning and losing. And so the game will never end
		 */
	
		while(!pile1.isEmpty() && !pile2.isEmpty()) {
			Card card1 = pile1.popCard();
			Card card2 = pile2.popCard();
			System.out.println(pile1.cards.size() + " " + pile2.cards.size() + " " + turns);

			//card 1 greater
			if(card1.compareTo(card2) > 0) {
				pile1.addCard(card1);
				pile1.addCard(card2);
			//card 2 greater
			} else if(card1.compareTo(card2) < 0) {
				pile2.addCard(card1);
				pile2.addCard(card2);
			//cards are equal (lets just give them back!)
			} else {
				pile1.addCard(card1);
				pile2.addCard(card2);
			}
			turns++;
		}
		System.out.println(turns);
		if(pile1.isEmpty()) {
			System.out.println("Player 2 Wins!");
		} else {
			System.out.println("Player 1 Wins!");
		}
	}
	
}
