
public class FindEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 4, 6, 8, 10, 12, 13 }; //expected result: { 5, 3 }
		int[] result = findEvenOdd(arr);
		System.out.print("Evens: " + result[0] + "\n");
		System.out.print("Odd: " + result[1] + "\n");
	}

	public static int[] findEvenOdd(int[] arr) {
		int even = 0;
		int odd = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		int[] returned = { even, odd };
		return returned;
	}
	
}
