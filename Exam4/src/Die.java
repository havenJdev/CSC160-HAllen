import java.util.Random;

public class Die {
	private int numSides;
	private int value;
	
	private Random random;
	
	public Die() {
		this.numSides = 6;
		this.random = new Random();
	}
	public Die(int numSides) {
		this.numSides = numSides;
		this.random = new Random();
	}
	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Die [numSides=" + numSides + ", value=" + value + "]";
	}
	
	public void roll() {
		this.value = random.nextInt(1, this.numSides+1);
	}
}
