import java.util.Scanner;

public class WhileFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many terms: ");
		int input = scanner.nextInt();
		scanner.close();
		fibonacci(input);
	}
	
	public static void fibonacci(int n) {
		int i = 1;
		int num1 = 1;
		int num2 = 0;
		while(i <= n) {
			
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
			i++;
		}
	}

}
