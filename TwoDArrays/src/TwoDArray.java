
public class TwoDArray {
	private int[][] tables;
	
	public TwoDArray() {
		tables = new int[10][10];
		for(int i = 0; i < tables.length; i++) {
			for(int j = 0; j < tables[i].length; j++) {
				tables[i][j] += (i+1)*(j+1);
			}
		}
	}
	
	public int[][] getTables() {
		return tables;
	}
	
}
