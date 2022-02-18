import java.util.Scanner;

public class SumIntWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers to sum: ");
		int input = scanner.nextInt();
		sumAll(input);
		scanner.close();
	}
	
	public static void sumAll(int count) {

		int sum = 0;
		int i = 1;
		while(i <= count) {

			if(i != count) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			sum += i;
			i++;
		}
		System.out.print(sum);
	}
}
