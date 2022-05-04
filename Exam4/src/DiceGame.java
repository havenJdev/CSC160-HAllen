import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Player[] players;
		int sides = -1;
		int numPlayers = -1;
		Scanner scanner = new Scanner(System.in);
		
			//Get # of sides on a die
			System.out.println("How many sides on a die?: ");
			try {
				sides = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Error, wrong input type (expected number), exiting gracefully");
				System.exit(-1);
			}

			//Get # of players
			System.out.println("How many players?: ");
			try {
				numPlayers = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Error, wrong input type (expected number), exiting gracefully");
				System.exit(-1);
			}
			players = new Player[numPlayers];
			
			scanner.nextLine();
			
			//Get player names and assign them a die
			for(int i = 1; i <= numPlayers; i++) {
				System.out.println("Player " + i + " what is your name?: ");
				String name = scanner.nextLine();
				Player newPlayer = new Player(name);
				newPlayer.setDie(new Die(sides));
				players[i-1] = newPlayer;
			}
			
			//Roll each person's die and print what they rolled
			for(Player player : players) {
				player.getDie().roll();
				System.out.println("Player " + player.getName() + " rolled a " 
				+ player.getDie().getValue() + " on a " + sides + " sided die.");
			}
			
			//Decide the winner
			int winnerIdx = decideWinner(players);
			
			//If -1, it was a draw
			if(winnerIdx < 0) {
				System.out.println("There was a tie between 2 or more players");
			//Otherwise, someone won
			} else {
				System.out.println("Player " + players[winnerIdx].getName() + " won the game");
			}
			
		scanner.close();
	}

	public static int decideWinner(Player[] players) {
		
		int winner = -1;
		Player winnerPlayer = null;
		for(int i = 0; i < players.length; i++) {
			Player player = players[i];
			if(winnerPlayer == null) {
				winner = i;
			}
			winnerPlayer = players[winner];
			if(winnerPlayer == player) {
				continue;
			}
			if((player.getDie().getValue() > winnerPlayer.getDie().getValue()) ) {
				winner = i;
			} else if (player.getDie().getValue() == winnerPlayer.getDie().getValue()) {
				winner = -1;
			}
		}
		return winner;
	}
	
}
