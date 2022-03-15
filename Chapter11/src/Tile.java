
public class Tile {

	private char letter;
	private int value;
	
	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}
	
	/*
	 * Accessors
	 */
	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/*
	 * Methods
	 */
	public static void printTile(Tile tile) {
		System.out.println("Tile letter: " + tile.getLetter());
		System.out.println("Tile value: " + tile.getValue());
	}

	public String toString() {
		return "Tile [letter=" + letter + ", value=" + value + "]";
	}

	public boolean equals(Tile other) {
		return this.letter == other.getLetter() && this.value == other.getValue();
	}

	
}
