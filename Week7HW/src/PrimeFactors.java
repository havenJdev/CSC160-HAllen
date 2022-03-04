import java.math.BigInteger;
import java.util.Arrays;

public class PrimeFactors {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,7,11,13,17,19,23,29,31,37};
		boolean[] prim = sieve(24);
		System.out.println("Result: " + arePrimeFactors(arr,7420738134810L)); //expected: true
		System.out.println("Result: " + arePrimeFactors(arr,2667845L)); //expected: false
		arr[2] = 4;
		System.out.println("Result: " + arePrimeFactors(arr,7420738134810L)); //expected: false
		System.out.println("Result: " + arePrimeFactors(arr,8L)); //expected: false
	}
	
	public static boolean[] sieve(int n) {
		boolean[] a = new boolean[n];
		for(int i = 0; i < n; i++) {
			//System.out.println(i);
			a[i] = true;
		}
		for (int j = 2; j * j <= n; j++)
        {
            if (a[j] == true)
            {
                for (int i = j * j; i < n; i += j)
                    a[i] = false;
            }
        }
		return a;
	}

	public static boolean arePrimeFactors(int[] a, long n) {
		int greatest = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > greatest) {
				greatest = a[i];
			}
		}
		boolean[] primes = sieve(greatest+1);
		
		double product = 1;
		for(int i = 0; i < a.length; i++) {
			product = product * a[i];
			//System.out.print(a.length-1 + "\n");
			//System.out.print(product + "\n");
			if(primes[a[i]] != true) {
				return false;
			}
		}
		if(product != n) {
			return false;
		}
		
		return true;
	}
}
