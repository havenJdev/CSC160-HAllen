import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSclassesWrite {
	
	/*
	 * This is the in-class exercise!
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//these are different somehow, I don't remember how.
		List<Course> courseList = new LinkedList<>();
		List<Course> courseList2 = new LinkedList<>();
		
		String type = "";
		
		File myFile = new File("courses.csv");
		if(!myFile.exists()) {
			try {
				myFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(new FileOutputStream(myFile.getName(), false));
			printWriter.print("");
			printWriter.close();
			printWriter = new PrintWriter(new FileOutputStream(myFile.getName(), true));
			printWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		//user input/file write
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
					//write
					printWriter.println("InPersonCourse" + "," + courseNum + "," + numStudents + "," + 
					maxStudents + "," + credits + "," + roomNumber);

					if(printWriter.checkError()) {
						System.out.println("There were errors");
					}
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
					//write
					printWriter.println("FullRemoteCourse" + "," + courseNum + "," + numStudents + "," + 
					maxStudents + "," + credits + "," + email);

					if(printWriter.checkError()) {
						System.out.println("There were errors");
					}
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
					//write
					printWriter.println("RealTimeRemoteCourse" + "," + courseNum + "," + numStudents + "," +
					maxStudents + "," + credits + "," + zoom);

					if(printWriter.checkError()) {
						System.out.println("There were errors");
					}
				} else {
					System.out.println("Not a valid course type, try again");
				}
			}
		}
		
		// file read
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
				courseList2.add(course);
			}
			if(courseData[0].equals("RealTimeRemoteCourse")) {
				String courseNum = courseData[1];
				int numStudents = Integer.valueOf(courseData[2]);
				int maxStudents = Integer.valueOf(courseData[3]);
				int credits = Integer.valueOf(courseData[4]);
				String zoom = courseData[5];
				RealTimeRemoteCourse course = new RealTimeRemoteCourse(courseNum, numStudents, 
						maxStudents, credits, zoom);
				courseList2.add(course);
			}
			if(courseData[0].equals("FullRemoteCourse")) {
				String courseNum = courseData[1];
				int numStudents = Integer.valueOf(courseData[2]);
				int maxStudents = Integer.valueOf(courseData[3]);
				int credits = Integer.valueOf(courseData[4]);
				String email = courseData[5];
				FullRemoteCourse course = new FullRemoteCourse(courseNum, numStudents, 
						maxStudents, credits, email);
				courseList2.add(course);
			}
		}
		System.out.println("\n\nPRINTED COURSES\n");
		for(Course course : courseList2) {
			printCourse(course);
		}
		scanner.close();
		fileScanner.close();
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
