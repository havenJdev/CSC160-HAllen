import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int day;
		
		do {
			System.out.print("Enter a number 1-7: ");
			day = scanner.nextInt();
		} while(day < 1 || day > 7);
		System.out.println("Corresponding day: " + getWeekDay(day));
		
		scanner.close();
	}
	public static String getWeekDay(int day) {
		if(day == 1) {
			return "Sunday";
		} else if(day == 2) {
			return "Monday";
		} else if(day == 3) {
			return "Tuesday";
		} else if(day == 4) {
			return "Wednesday";
		} else if(day == 5) {
			return "Thursday";
		} else if(day == 6) {
			return "Friday";
		} else if(day == 7) {
			return "Saturday";
		} else {
			return "Invalid day.";
		}
	}

}
