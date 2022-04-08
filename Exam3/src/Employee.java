
public class Employee extends Person {
	private String office;
	private int salary;
	private String dateHired;
	
	public Employee() {
		
	}
	
	public Employee(String name, String address, String phoneNumber, String email, String office, int salary,
			String dateHired) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
}
