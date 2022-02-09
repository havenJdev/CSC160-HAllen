import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int myNumber = random.nextInt(100) + 1; // 0-99 + 1 -> 1-100 inclusive
		System.out.println("I'm thinking of a number between 1 and 100 "
				+ "(including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		int guess = in.nextInt();
		System.out.println("The number I was thinking of is: " + myNumber);
		System.out.println("Your guess is: " + guess);

		if (guess > myNumber) {
			System.out.println("You were off by: " + (guess - myNumber) );
		} else if (guess < myNumber) {
			System.out.println("You were off by: " + (myNumber - guess) );
		} else {
			System.out.println("You got it!");
		}
		
		in.close();
		
	}

}
