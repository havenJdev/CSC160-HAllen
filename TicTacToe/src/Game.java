import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		GameBoard board = new GameBoard();
		int turns = 0;
		String player = "X"; // x goes first
		
		Scanner sc = new Scanner(System.in);
		
		while(turns < 9) {
			turns++;
			// turns % 2 to determine x or o
			if(turns % 2 == 0) {
				player = "O";
				System.out.println("O your turn");
			} else {
				player = "X";
				System.out.println("X your turn");
			}
			// ask for row, column
			System.out.print("Row: ");
			int r = sc.nextInt();
			sc.nextLine();
			System.out.print("Column: ");
			int c = sc.nextInt();
			// valid check
			if(board.spotIsEmpty(r,c)) {
				System.out.println("all good");
				board.play(player,r,c);
				System.out.println("played");
			} else {
				System.out.println("its full, not played");
			
			}
			// put x or o in [r][c]
			
		}
		
		sc.close();
	}
}
