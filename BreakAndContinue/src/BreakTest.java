import java.util.ArrayList;
import java.util.List;

public class BreakTest {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		
//		for(int i = 0; i < 10; i++) {
//			arr.add(i);
//		}
		
		arr.add(0);
		arr.add(3);
		arr.add(2);
		arr.add(3);
		
		
		for (Integer integer : arr) {
			if(integer == 3) {
				System.out.println("Found 3");
				break;
			}
		}
		
//		for(int i = 0; i < arr.size(); i++) {
//			if(arr.get(i) == 3) {
//				System.out.println("Found 3 at " + i);
//				break;
//			}
//		}
		
	}
}
