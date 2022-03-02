
public class FindValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 7};
		System.out.println(hasValue(arr, 5));
		System.out.println(hasValue(arr, 6));
	}

	public static boolean hasValue(int[] arr, int val) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val) {
				return true;
			}
		}
		return false;
	}
	
}
