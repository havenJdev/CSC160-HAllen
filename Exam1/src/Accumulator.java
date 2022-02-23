import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(num != 0) {
			
			System.out.print("Enter number: ");
			num = scanner.nextInt();
			sum += num;
			
		}
		
		System.out.println("Total sum: " + sum );
		
		scanner.close();
		
		
	}

}
