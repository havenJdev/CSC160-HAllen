import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Course> courseList = new ArrayList<Course>();
		
		String type = "";
		
		for(int i = 0; i < 3; i++) {
			type = "";
			while(!(type.toLowerCase().equals("inpersoncourse") || type.toLowerCase().equals("fullremotecourse") || type.toLowerCase().equals("realtimeremotecourse"))) {
				System.out.print("Course Type (InPersonCourse, FullRemoteCourse, RealTimeRemoteCourse): ");
				type = scanner.nextLine();
				if(type.toLowerCase().equals("inpersoncourse")) {
					System.out.print("Course Number: ");
					String courseNum = scanner.nextLine();
					System.out.print("Number of Students: ");
					int numStudents = scanner.nextInt();
					System.out.print("Maximum Students: ");
					int maxStudents = scanner.nextInt();
					System.out.print("Number of Credits: ");
					int credits = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Room Number: ");
					String roomNumber = scanner.nextLine();
					InPersonCourse course = new InPersonCourse(courseNum, numStudents, maxStudents, credits, roomNumber);
					courseList.add(course);
				} else if(type.toLowerCase().equals("fullremotecourse")) {
					System.out.print("Course Number: ");
					String courseNum = scanner.nextLine();
					System.out.print("Number of Students: ");
					int numStudents = scanner.nextInt();
					System.out.print("Maximum Students: ");
					int maxStudents = scanner.nextInt();
					System.out.print("Number of Credits: ");
					int credits = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Course Email: ");
					String email = scanner.nextLine();
					FullRemoteCourse course = new FullRemoteCourse(courseNum, numStudents, maxStudents, credits, email);
					courseList.add(course);
				} else if(type.toLowerCase().equals("realtimeremotecourse")) {
					System.out.print("Course Number: ");
					String courseNum = scanner.nextLine();
					System.out.print("Number of Students: ");
					int numStudents = scanner.nextInt();
					System.out.print("Maximum Students: ");
					int maxStudents = scanner.nextInt();
					System.out.print("Number of Credits: ");
					int credits = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Zoom Information: ");
					String zoom = scanner.nextLine();
					RealTimeRemoteCourse course = new RealTimeRemoteCourse(courseNum, numStudents, maxStudents, credits, zoom);
					courseList.add(course);
				} else {
					System.out.println("Not a valid course type, try again");
				}
			}
		}
		System.out.println("\n\n");
		for(Course course : courseList) {
			printCourse(course);
		}
	}
	
	private static void courseString(Course course) {
		System.out.println(course.toString());
	}
	
	private static void printCourse(Course course) {
		StringBuilder sb = new StringBuilder();
		if(course instanceof InPersonCourse) {
			InPersonCourse ipc = (InPersonCourse)course;
			sb.append("Course Number: " + ipc.getCourseNum());
			sb.append("\n");
			sb.append("Number of Students: " + ipc.getNumStudents());
			sb.append("\n");
			sb.append("Maximum Students: " + ipc.getMaxStudents());
			sb.append("\n");
			sb.append("Number of Credits: " + ipc.getCredits());
			sb.append("\n");
			sb.append("Room Number: " + ipc.getRoomNumber());
			sb.append("\n");
		}
		if(course instanceof FullRemoteCourse) {
			FullRemoteCourse frc = (FullRemoteCourse)course;
			sb.append("Course Number: " + frc.getCourseNum());
			sb.append("\n");
			sb.append("Number of Students: " + frc.getNumStudents());
			sb.append("\n");
			sb.append("Maximum Students: " + frc.getMaxStudents());
			sb.append("\n");
			sb.append("Number of Credits: " + frc.getCredits());
			sb.append("\n");
			sb.append("Course Email: " + frc.getEmail());
			sb.append("\n");
		}
		if(course instanceof RealTimeRemoteCourse) {
			RealTimeRemoteCourse rtrc = (RealTimeRemoteCourse)course;
			sb.append("Course Number: " + rtrc.getCourseNum());
			sb.append("\n");
			sb.append("Number of Students: " + rtrc.getNumStudents());
			sb.append("\n");
			sb.append("Maximum Students: " + rtrc.getMaxStudents());
			sb.append("\n");
			sb.append("Number of Credits: " + rtrc.getCredits());
			sb.append("\n");
			sb.append("Zoom Information: " + rtrc.getZoom());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
