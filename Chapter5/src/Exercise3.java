import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double num = scanner.nextDouble();
		
		if (num == 0) {
			System.out.println("Number is zero");
		} else if (num > 0) {
			if (num < 1) {
				System.out.println("Number is positive and small");
			} else if (num > 1000000) {
				System.out.println("Number is positive and large");
			} else {
				System.out.println("Number is positive");
			}
		} else if (num < 0) {
			System.out.println("Number is negative");
		}
		
		scanner.close();
			
	}

}
