import java.util.Arrays;

public class ArrayKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(fizzArray1(4)));
		System.out.println(Arrays.toString(fizzArray1(1)));
		System.out.println(Arrays.toString(fizzArray1(10)));
		System.out.println(Arrays.toString(fizzArray1(0)));
		System.out.print("\n");
		System.out.println(Arrays.toString(fizzArray3(5,10)));
		System.out.println(Arrays.toString(fizzArray3(11,18)));
		System.out.println(Arrays.toString(fizzArray3(1,3)));
		System.out.println(Arrays.toString(fizzArray3(0,0)));
		
	}

	public static int[] fizzArray1(int n) {
		int[] output = new int[n];
		
		for(int i = 0; i < n; i++) {
			output[i] = i;
		}
		return output;
	}
	
	public static int[] fizzArray3(int start, int end) {
		int len = end - start;
		int[] output = new int[len];
		
		for(int i = start; i < end; i++) {
			output[i-start] = i;
		}
		
		return output;
	}
}
