import java.util.Scanner;

public class SumIntFor {

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
		for(int i = 1; i <= count; i++) {
			if(i != count) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			sum += i;
		}
		System.out.print(sum);
	}
	
}
