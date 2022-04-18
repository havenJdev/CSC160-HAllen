
public class Transpose {
	public static void main(String[] args) {
		int rows = 3;
		int columns = 2;
		int[][] mat = new int[rows][columns];
		int n = 1;
		//fill array
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] += n;
				n++;
			}
		}
		
		System.out.println(print2D(mat));
		
		System.out.println(print2D(transpose(mat)));
	}
	
	public static int[][] transpose(int[][] matrix) {
		int[][] matT = new int[matrix[0].length][matrix.length];
		
		for(int i = 0; i < matrix[0].length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				matT[i][j] = matrix[j][i];
			}
		}
		
		return matT;
		
	}
	
	public static String print2D(int[][] array) {
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0; i < array.length; i++) {
			StringBuilder sb2 = new StringBuilder();
			for(int j = 0; j < array[i].length; j++) {
				sb2.append(String.format("%03d", array[i][j]));
				sb2.append(", ");
			}
			sb1.append("\n");
			sb1.append(sb2);
		}
		
		return sb1.toString();
	}
	
}
