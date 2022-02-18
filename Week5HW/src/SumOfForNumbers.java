public class SumOfForNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sumAll(10);
	}

	public static void sumAll(int count) {

		int sum = 0;
		for(int i = 1; i <= count; i++) {
			if(i != count) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			sum += i;
		}
		System.out.print(sum);
	}
	
}
