import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		Scanner scanner = null;
		
//		try {
//			file = new File("SampleInput");
//			scanner = new Scanner(file);
//			while(scanner.hasNextLine()) {
//				String line = scanner.nextLine();
//				String[] strArr = line.split(",");
////				System.out.println("Strings: " + Arrays.toString(strArr));
//				
//				int[] intArr = new int[strArr.length];
//				
//				for(int i = 0; i < strArr.length; i++) {
//					int num = Integer.valueOf(strArr[i]);
//					intArr[i] = num;
//				}
//				
////				System.out.println("Ints: " + Arrays.toString(intArr));
//			}
			
//			int[] ints = {1,2,3};
//			System.out.println(ints[10]);
//			
			int x = 5;
//			int y = 0;
			int z = 0;
			
			int y = (x == 5 ? 2 : 3);
			System.out.println(y);				
			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("e");
//			System.out.println(e.getMessage());
//			
////			e.printStackTrace();
////			System.out.println("e");
//			System.exit(-1);
//		} finally {
//			scanner.close();
//		}
	}

}
