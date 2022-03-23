
public class MultSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultSumResult result = multAndAdd(5, 10);
		System.out.println(result.getSum());
		System.out.println(result.getProduct());
	}

	public static MultSumResult multAndAdd(double a, double b) {
		MultSumResult result = new MultSumResult();
		result.setProduct(a*b);
		result.setSum(a+b);
		
		return result;
	}
}
