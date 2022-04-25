import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		GameBoard board = new GameBoard();
		int turns = 0;
		String winner = "-";
		String player = "X"; // X goes first
		
		Scanner sc = new Scanner(System.in);
		
		while(turns < 9 && winner.equals("-")) {
			turns++;
			// turns % 2 to determine x or o
			if(turns % 2 == 0) {
				player = "O";
				System.out.println("O, your turn");
			} else {
				player = "X";
				System.out.println("X, your turn");
			}
			board.print();
			// ask for row, column
			int r = -1, c = -1;
			do {
				do {
					System.out.print("Row (1-3): ");
					r = sc.nextInt();
					sc.nextLine();
					if(r < 1 || r > 3) {
						System.out.println("Row should be from 1-3, try again!");
					}
				} while(r < 1 || r > 3);
				do {
					System.out.print("Column (1-3): ");
					c = sc.nextInt();
					sc.nextLine();
					if(c < 1 || c > 3) {
						System.out.println("Column should be from 1-3, try again!");
					}
				} while(c < 1 || c > 3);
				if(!board.spotIsEmpty(r, c)) {
					System.out.println("That spot is full! Try again.");
				}
			} while(!board.spotIsEmpty(r,c));
			
			//put player's symbol in spot row, column
			board.play(player,r,c);
			//find out who won, if anyone
			winner = board.winCheck();
		}
		
		System.out.println("\n" + winner + " wins!");
		
		sc.close();
	}
}
