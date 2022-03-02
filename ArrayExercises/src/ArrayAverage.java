
public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 38, 2, 300 };
		System.out.printf("Avg: %.2f", arrayAvg(arr));
	}

	public static double arrayAvg(int[] arr) {
		int len = arr.length;
		System.out.println(len);
		int smallest = arr[0];
		int largest = arr[0];
		for(int i = 0; i < len; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		double result = 0;
		for(int i = 0; i < len; i++) {
			result += arr[i];
		}
		
		result = result - smallest - largest;
		result = result / (len-2);
		return result;
		
	}
	
}
