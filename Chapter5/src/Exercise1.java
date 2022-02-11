import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double input = scanner.nextDouble();
		System.out.println("Is number positive: " + isPositive(input));
		
		scanner.close();

	}
	
	public static boolean isPositive(double num) {
		return num >= 0;
	}

}
