
public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 7};
		int[] rv = reverseArray(arr);
		//int[] st = sort(arr);
		
		sort(arr);
		
		for(int i = 0; i < rv.length; i++) {
			//System.out.print(rv[i] + " ");
		}
		
		/*
		for(int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
		*/
	}
	
	public static int[] reverseArray(int[] arr) {
		int[] reversed = new int[arr.length];

		for(int i = arr.length; i > 0; i--) {
			reversed[arr.length - i] = arr[i-1];
		}
		
		return reversed;
	}
	
	public static void sort(int[] tosort) {
		for(int i = 0; i < tosort.length / 2; i++) {
			int x = tosort[i];
			tosort[i] = tosort[tosort.length - i - 1];
			tosort[tosort.length - i - 1] = x;
		}

		for(int i = 0; i < tosort.length; i++) {
			System.out.print(tosort[i] + " ");
		}
		
		//return tosort;
	}
}
