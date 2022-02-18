import java.util.Scanner;

public class ForFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many terms: ");
		int input = scanner.nextInt();
		scanner.close();
		fibonacci(input);
	}
	
	public static void fibonacci(int n) {
		int num1 = 1;
		int num2 = 0;
		for(int i = 1; i <= n; i++) {
			
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
	}

}
