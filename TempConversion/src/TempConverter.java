
public class TempConverter {

	public static void main(String[] args) {
		double tempF = 25;
		double tempC;
		
		// F -> C
		tempC = (tempF - 32.0) * (5.0/9.0);
		System.out.printf("Temp: %.2f\n", tempC);
		
		// C -> F
		tempC = 38.6;
		tempF = tempC * (9.0/5.0) + 32;
		System.out.printf("Temp: %.2f\n",tempF);
	}

}
