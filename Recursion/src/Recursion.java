import java.util.Scanner;

public class Recursion {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(sum(0));
		
	}
	
	public static int sum(int n) {
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		if(x == 0) {
			return n;
		}
		return sum(n+x);
	}
}
