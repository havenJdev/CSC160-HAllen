import java.util.ArrayList;

public class TestSchoolRecords {

	private static String printPerson(Person person) {
		StringBuilder sb = new StringBuilder();

		sb.append(person.getName() + ", ");
		sb.append(person.getAddress() + ", ");
		sb.append(person.getPhoneNumber() + ", ");
		sb.append(person.getEmail() + ", ");
		
		if(person instanceof Student) {
			Student student = (Student)person;
			sb.append(student.getStatus());
		}
		if(person instanceof Faculty) {
			Faculty faculty = (Faculty)person;
			sb.append(faculty.getOffice() + ", ");
			sb.append(faculty.getSalary() + ", ");
			sb.append(faculty.getDateHired() + ", ");
			sb.append(faculty.getOfficeHours() + ", ");
			sb.append(faculty.getRank());
		}
		if(person instanceof Staff) {
			Staff staff = (Staff)person;
			sb.append(staff.getOffice() + ", ");
			sb.append(staff.getSalary() + ", ");
			sb.append(staff.getDateHired() + ", ");
			sb.append(staff.getTitle());
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {

		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Student("John Smith", "400 Main Street", "555-293-4598", "johnsmith@email.com", "freshman"));
		people.add(new Student("Mike Tyson", "500 Main Street", "555-584-3939", "miketyson@email.com", "senior"));
		people.add(new Faculty("Dave Johnson", "123 Work Road", "555-123-4994", "davejohnson@email.com", "259B", 35000, "3-14-2021", "9am-5pm", "senior"));
		people.add(new Faculty("Mark Jones", "304 Main Street", "555-755-5434", "markjones@email.com", "335A", 32000, "1-23-2020", "10am-4pm", "junior"));
		people.add(new Staff("James Johnson", "430 Staff Drive", "555-302-1111", "jamesjohnson@email.com", "102A", 40000, "2-28-2020", "Professor"));
		people.add(new Staff("Bill Jackson", "321 Soap Drive", "555-310-8923", "billjackson@email.com", "234B", 28000, "1-13-2022", "Janitor"));
		
		for(Person person : people) {
			System.out.println(printPerson(person));
		}
	}
	

}
