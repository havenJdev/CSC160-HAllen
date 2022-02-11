import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = scanner.nextDouble();
		System.out.print("Enter third number: ");
		double num3 = scanner.nextDouble();
		
		System.out.println(greatestNumber(num1, num2, num3));
		
		scanner.close();
	}
	
	public static String greatestNumber(double num1, double num2, double num3) {
		// in csc119 checking stuff like if the numbers are the same wouldn't have been required
		// I don't know the guideline on it here so I do it just in case
		if (num1 > num2 && num1 > num3) {
			return "The first number is greatest.";
		} else if (num2 > num1 && num2 > num3) {
			return "The second number is greatest.";
		} else if (num3 > num1 && num3 > num2) {
			return "The third number is greatest.";
		} else if (num1 == num2 && num1 > num3) {
			return "The first and second numbers are the same, and greatest.";
		} else if (num1 == num3 && num1 > num2) {
			return "The first and third numbers are the same, and greatest.";
		} else if (num2 == num3 && num2 > num1) {
			return "The second and third numbers are the same, and greatest.";
		} else {
			return "All numbers are equal, or something went wrong.";
		}
	}

}
