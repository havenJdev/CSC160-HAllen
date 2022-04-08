
public class Staff extends Employee {
	private String title;

	public Staff() {
		
	}
	
	public Staff(String name, String address, String phoneNumber, String email, String office, int salary,
			String dateHired, String title) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
