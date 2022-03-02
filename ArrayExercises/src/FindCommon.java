
public class FindCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {4,5,6,7,8};
		int[] arr3 = findCommon(arr1,arr2);
		
		for(int i = 0;i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
	}

	public static int[] findCommon(int[] arr1, int[] arr2) {
		int size = 0;
		if(arr1.length > arr2.length) {
			size = arr1.length;
		} else {
			size = arr2.length;
		}
		int[] arr3 = new int[size];
		
		int ind = 0;
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					arr3[ind] = arr1[i];
					ind++;
				}
			}
		}
		return arr3;
	}
}
