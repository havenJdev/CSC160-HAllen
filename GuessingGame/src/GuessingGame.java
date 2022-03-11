import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int low = 10;
		int high = 20;
		
		int rand = -1;
		int guess = 0;
		int points = 5;
		
		Random rng = new Random();
		rand = rng.nextInt(low, high+1);
		
		while(guess != rand) {
			System.out.print("Guess a number 10-20: ");
			guess = in.nextInt();
			if(guess > rand) {
				System.out.println("Too high!");
				points--;
			} else if(guess < rand) {
				System.out.println("Too low!");
				points--;
			} else {
				System.out.println("Correct!");
				if(points < 0) {
					points = 0;
				}
			}
		}

		System.out.print("The number was: " + rand + "\n");
		System.out.print("You had: " + points + " points");
		
		in.close();
		
	}

}
