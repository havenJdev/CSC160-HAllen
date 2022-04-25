
public class GameBoard {
	private String[][] board;
	public GameBoard() {
		board = new String[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = "-";
			}
		}
	}
	
	public boolean spotIsEmpty(int row, int column) {
		//row-1, column-1 because inputs is 1-3 and array is 0-2
		if(row < 1 || column < 1 ) {
			return false;
		}
		return (board[row-1][column-1] == null || board[row-1][column-1].isEmpty() || board[row-1][column-1].equals("-"));
	}
	
	public void play(String player, int row, int column) {
		
		//row-1, column-1 because inputs is 1-3 and array is 0-2
		if(spotIsEmpty(row, column)) {
			board[row-1][column-1] = player;
		}
	}
	
	public String winCheck() {
		for(int i = 0; i < 3; i++) {
			//horizontal
			if(board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) ) {
				return board[i][0];
			}
			//vertical
			if(board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) ) {
				return board[0][i];
			}
		}
		//left diagonal
		if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) ) {
			return board[0][0];
		}
		//right diagonal
		if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) ) {
			return board[2][0];
		}
		
		return "-";
	}
	
	public void print() {
		
		StringBuilder bbuilder = new StringBuilder();

		//This could be done with loops, but this is easier and better probably.
		bbuilder.append(board[0][0]);
		bbuilder.append(" | ");
		bbuilder.append(board[0][1]);
		bbuilder.append(" | ");
		bbuilder.append(board[0][2]);
		bbuilder.append("\n");
		bbuilder.append("--+---+--");
		bbuilder.append("\n");
		
		bbuilder.append(board[1][0]);
		bbuilder.append(" | ");
		bbuilder.append(board[1][1]);
		bbuilder.append(" | ");
		bbuilder.append(board[1][2]);
		bbuilder.append("\n");
		bbuilder.append("--+---+--");
		bbuilder.append("\n");
		
		bbuilder.append(board[2][0]);
		bbuilder.append(" | ");
		bbuilder.append(board[2][1]);
		bbuilder.append(" | ");
		bbuilder.append(board[2][2]);
		bbuilder.append("\n");
		
		System.out.println(bbuilder.toString());
		
	}
	
}
