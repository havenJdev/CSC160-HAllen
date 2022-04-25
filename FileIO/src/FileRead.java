import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		Scanner scanner = null;
		
		try {
			file = new File("SampleInput");
			scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] strArr = line.split(",");
				System.out.println("Strings: " + Arrays.toString(strArr));
				
				int[] intArr = new int[strArr.length];
				
				for(int i = 0; i < strArr.length; i++) {
					int num = Integer.valueOf(strArr[i]);
					intArr[i] = num;
				}
				
				System.out.println("Ints: " + Arrays.toString(intArr));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("e");
			e.printStackTrace();
			System.out.println("e");
			System.exit(-1);
		} finally {
			scanner.close();
		}
	}

}
