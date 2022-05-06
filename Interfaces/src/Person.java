
public class Person implements Comparable<Person> {

	private int height;
	private int weight;
	
	public Person(int height, int weight) {
		this.height = height;
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}
	
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.height + "," + this.weight;
	}

	@Override
	public int compareTo(Person o) {
		return this.height - o.height;
	}
	
	
}
