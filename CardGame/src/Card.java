public class Card {

	private int suit;
	private int rank;
	
	public static final String[] RANKS = {
			null, "Ace", "2", "3", "4", "5", "6",
			"7", "8", "9", "10", "Jack", "Queen", "King"
	};
	
	public static final String[] SUITS = {
			"Clubs", "Diamonds", "Hearts", "Spades"
	};
	
	public Card(int rank, int suit) {
		if(suit < 0 || suit > 3) {
			throw new ArithmeticException("Argument #1 (" + suit + ") out of range for range 0-3");
		}
		if(rank < 1 || rank > 14) {
			throw new ArithmeticException("Argument #2 (" + rank + ") out of range for range 1-13");
		}
		this.suit = suit;
		this.rank = rank;
	}
	
	public int getSuit() {
		return suit;
	}
	public int getRank() {
		return rank;
	}

	public String toString() {
		return RANKS[this.rank] + " of " + SUITS[this.suit];
	}

	public boolean equals(Card other) {
		return this.rank == other.getRank() && this.suit == other.getSuit();
	}
	
	
	public int compareTo(Card other) {
		//This is changed to always just return 1, so that the War game is winnable.
		//Obviously, this breaks selection sort.
		
		if(this.suit > other.suit) {
			return 1;
		}
		//defaut: return -1
		if(this.suit < other.suit) {
			return 1;
		}
		if(this.rank > other.rank) {
			return 1;
		}
		//defaut: return -1
		if(this.rank < other.rank) {
			return 1;
		}
		return 0;

		
		
	}
}
