import java.util.Scanner;

public class CourseTest {
	
	
	public static void main(String[] args) {
		Course course1 = new Course();
		Course course2 = new Course("CSC166");
		Course course3 = new Course("CSC166",4);
		Course course4 = new Course("CSC166",4,25);
		System.out.println(course1.tostring());
		System.out.println(course2.tostring());
		System.out.println(course3.tostring());
		System.out.println(course4.tostring());
		
		System.out.println("\nArray");
		Course[] arr = new Course[5];
		arr[0] = course1;
		arr[1] = course2;
		arr[2] = course3;
		arr[3] = course4;
		for(Course course : arr) {
			System.out.println(course);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int credits;
		int maxStudents;
		
		do {
			System.out.println("Enter course name: ");
			name = scanner.nextLine();
		} while(!name.startsWith("CSC"));
		do {
			System.out.println("Enter amount of credits: ");
			credits = scanner.nextInt();
		} while(credits <= 0);
		do {
			System.out.println("Enter max students: ");
			maxStudents = scanner.nextInt();
		} while(maxStudents <= 0);
		Course createdCourse = new Course(name,credits,maxStudents);
		System.out.println(createdCourse.tostring());

		arr[4] = createdCourse;
		
		scanner.close();
	}
	
}
