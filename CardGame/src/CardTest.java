public class CardTest {

	public static void main(String[] args) {
//		Card card1 = new Card(1,3);
//		System.out.println(card1);
//		Card card2 = new Card(5,2);
//		System.out.println(card1.equals(card2));
//		Card card3 = new Card(12,2);
//		System.out.println(card2.compareTo(card3));
//		System.out.println(card2);
//		System.out.println(card3);
//		Card card4 = new Card(13,1);
//		System.out.println(card4);
//		
//		Card[] cards = new Card[52];
//		for(int i = 0; i < Card.SUITS.length; i++) {
//			for(int j = 1; j < Card.RANKS.length; j++) {
//				cards[i*13+j-1] = new Card(j,i);
//
//			}
//		}
//		System.out.println(Arrays.toString(cards));
		Deck deck = new Deck();
//		System.out.println(deck.tostring());
//		System.out.println(deck.subDeck(0, 26).tostring());
//		
//		//deck.shuffle();
//		System.out.println(deck.tostring());
//	
//		Deck subdeck = deck.subDeck(26,52);
//		
//		Pile pile = new Pile();
//		pile.addDeck(subdeck);
//		System.out.println(pile.tostring());
		System.out.println(deck.tostring());
		deck.shuffle();
		System.out.println(deck.tostring());
//		deck.selectionSort();
		deck.insertionSort();
		System.out.println(deck.tostring());
		
	}
}