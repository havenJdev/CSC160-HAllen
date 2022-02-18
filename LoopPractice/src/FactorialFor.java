import java.util.Scanner;

public class FactorialFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers to factorial: ");
		int input = scanner.nextInt();
		factorial(input);
		scanner.close();
	}

	public static void factorial(int count) {
		int product = 1;
		
		for(int i = 1; i <= count; i++) {
			product *= i;
			if(i != count) {
			System.out.print(i + " * ");
			} else {
				System.out.print(i + " = " + product);
			}
		}
	}
}
