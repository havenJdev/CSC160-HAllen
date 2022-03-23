import java.util.Objects;

public class Course {

	private String name;
	private int numCredits;
	private int maxStudents;
	private int numStudents;
	
	//constructors
	public Course() {
		super();
		this.name = "ENG 101";
		this.numCredits = 6;
		this.maxStudents = 30;
		this.numStudents = 0;
	}
	public Course(String name) {
		super();
		this.name = name;
		this.numCredits = 6;
		this.maxStudents = 30;
		this.numStudents = 0;
	}
	public Course(String name, int numCredits) {
		super();
		this.name = name;
		this.numCredits = numCredits;
		this.maxStudents = 30;
		this.numStudents = 0;
	}
	public Course(String name, int numCredits, int maxStudents) {
		super();
		this.name = name;
		this.numCredits = numCredits;
		this.maxStudents = maxStudents;
		this.numStudents = 0;
	}
	//accessors
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumCredits() {
		return numCredits;
	}
	public void setNumCredits(int numCredits) {
		this.numCredits = numCredits;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public int getNumStudents() {
		return numStudents;
	}
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}
	public void addStudent() {
		this.numStudents++;
	}
	public void removeStudent() {
		this.numStudents--;
	}
	public String tostring() {
		return "Name: " + this.name + ", Credits: " + this.numCredits + ", Maximum Students: " + this.maxStudents + ", Students: " + this.numStudents; 
	}
	public boolean equals(Course other) {
		return this.name.equals(other.getName()) && this.numCredits == other.getNumCredits();
	}
}
