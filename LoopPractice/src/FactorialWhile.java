import java.util.Scanner;

public class FactorialWhile {

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
		int i = 1;
		while(i <= count) {
			product *= i;
			if(i != count) {
			System.out.print(i + " * ");
			} else {
				System.out.print(i + " = " + product);
			}
			i++;
		}
	}
}
