
public class Faculty extends Employee {
	private String officeHours;
	
	public Faculty() {
		
	}
	
	public Faculty(String name, String address, String phoneNumber, String email, String office, int salary,
			String dateHired, String officeHours, String rank) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	private String rank;
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
}
