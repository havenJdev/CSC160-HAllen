public class TenMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(makes10(7,3)) {
			System.out.println("The two numbers equal 10");
		} else {
			System.out.println("The two numbers do not equal 10");
		}
	
	}
	
	public static boolean makes10(int num1, int num2) {
		return(num1+num2 == 10);
	}
		
	

}
