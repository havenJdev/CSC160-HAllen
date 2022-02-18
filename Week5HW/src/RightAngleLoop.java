import java.util.Scanner;

public class RightAngleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeTriangle(getUserNumber());

	}

	public static int getUserNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int num = scanner.nextInt();
		scanner.close();
		return num;
	}
	
	public static void makeTriangle(int rows) {
		for(int i = 1;i <= rows; i++) {
			for(int j = 1;j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
	
}
