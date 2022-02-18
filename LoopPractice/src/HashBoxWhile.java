import java.util.Scanner;

public class HashBoxWhile {

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
		int i = 1;
		while(i <= h) {
			int j = 1;
			while(j <= w) {
				
				System.out.print("#");
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}

}
