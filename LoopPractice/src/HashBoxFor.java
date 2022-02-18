import java.util.Scanner;

public class HashBoxFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many columns: ");
		int column = scanner.nextInt();
		System.out.print("How many rows: ");
		int row = scanner.nextInt();
		
		printHashes(column,row);
		scanner.close();
	}
	
	public static void printHashes(int w, int h) {
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}

}
