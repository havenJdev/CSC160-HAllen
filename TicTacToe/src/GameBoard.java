
public class GameBoard {
	private String[][] board;
	public GameBoard() {
		board = new String[3][3];
	}
	
	public boolean spotIsEmpty(int row, int column) {
		return (board[row][column] == null || board[row][column].isEmpty());
	}
	
	public void play(String player, int row, int column) {
		if(spotIsEmpty(row, column)) {
			board[row][column] = player;
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
		
		return "";
	}
}
