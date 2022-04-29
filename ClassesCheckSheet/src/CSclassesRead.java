import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSclassesRead {
	
	/*
	 * This is for Homework 14!
	 */

	public static void main(String[] args) {
		List<Course> courseList = new LinkedList<>();
		
		File myFile = new File("courses.csv");
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		while(fileScanner.hasNextLine()) {
			String ln = fileScanner.nextLine();
			String[] courseData = ln.split(",");
			if(courseData[0].equals("InPersonCourse")) {
				String courseNum = courseData[1];
				int numStudents = Integer.valueOf(courseData[2]);
				int maxStudents = Integer.valueOf(courseData[3]);
				int credits = Integer.valueOf(courseData[4]);
				String roomNumber = courseData[5];
				InPersonCourse course = new InPersonCourse(courseNum, numStudents, 
						maxStudents, credits, roomNumber);
				courseList.add(course);
			}
			if(courseData[0].equals("RealTimeRemoteCourse")) {
				String courseNum = courseData[1];
				int numStudents = Integer.valueOf(courseData[2]);
				int maxStudents = Integer.valueOf(courseData[3]);
				int credits = Integer.valueOf(courseData[4]);
				String zoom = courseData[5];
				RealTimeRemoteCourse course = new RealTimeRemoteCourse(courseNum, numStudents, 
						maxStudents, credits, zoom);
				courseList.add(course);
			}
			if(courseData[0].equals("FullRemoteCourse")) {
				String courseNum = courseData[1];
				int numStudents = Integer.valueOf(courseData[2]);
				int maxStudents = Integer.valueOf(courseData[3]);
				int credits = Integer.valueOf(courseData[4]);
				String email = courseData[5];
				FullRemoteCourse course = new FullRemoteCourse(courseNum, numStudents, 
						maxStudents, credits, email);
				courseList.add(course);
			}
		}
		System.out.println("PRINTED COURSES\n");
		for(Course course : courseList) {
			printCourse(course);
		}
	}
	
	private static void printCourse(Course course) {
		StringBuilder sb = new StringBuilder();
		if(course instanceof InPersonCourse) {
			InPersonCourse ipc = (InPersonCourse)course;
			sb.append("InPersonCourse\n");
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
			sb.append("FullRemoteCourse\n");
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
			sb.append("RealTimeRemoteCourse\n");
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
