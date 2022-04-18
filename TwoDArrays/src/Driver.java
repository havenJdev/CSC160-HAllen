import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		TwoDArray arr = new TwoDArray();
		
		for(int i = 0; i < arr.getTables().length; i++) {
			System.out.println(Arrays.toString(arr.getTables()[i]));
		}
		
		
		
	}
}
