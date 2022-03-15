import java.util.Arrays;

public class Exercise95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = {0.0,1.0,2.0,3.0,4.0};
		
		int[] scores = {0,0,50,50,2,2,2,2,99};
		
		System.out.println(Arrays.toString(powArray(arr,2)));
		System.out.println(Arrays.toString(powArray(arr,3)));
		System.out.println(Arrays.toString(powArray(arr,1)));
		System.out.println(Arrays.toString(powArray(arr,0)));

		System.out.println(Arrays.toString(histogram(scores,100)));
	}
	public static double[] powArray(double[] a, int pow) {
		double[] b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Math.pow(a[i], pow);
		}
		return b;
	}
	
	public static int[] histogram(int[] scores, int counters) {
		int[] counts = new int[counters];
		for(int score : scores) {
			counts[score]++;
		}
		return counts;
	}
}
