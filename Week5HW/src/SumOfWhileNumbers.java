public class SumOfWhileNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumAll(10);
	}
	
	public static void sumAll(int count) {

		int sum = 0;
		int i = 1;
		while(i <= count) {

			if(i != count) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			sum += i;
			i++;
		}
		System.out.print(sum);
	}
}
