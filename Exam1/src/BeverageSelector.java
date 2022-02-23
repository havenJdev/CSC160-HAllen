import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter 1 for water, 2 for coke, or 3 for coffee: ");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			System.out.println("Water");
		} else if(choice == 2) {
			System.out.println("Coke");
		} else if(choice == 3) {
			System.out.println("Coffee");
		}
		
		scanner.close();
	}

}
