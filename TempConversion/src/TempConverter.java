import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		double degF;
		double degC;

		Scanner in = new Scanner(System.in);
		
		System.out.print("Deg F: ");
		degF = in.nextDouble();
		System.out.println("You input: " + degF);

		double temp;
		
		temp = (degF - 32.0) * (5.0/9.0);
		System.out.printf("Temp in degrees C: %.2f\n", temp);

		System.out.print("Deg C: ");
		degC = in.nextDouble();
		System.out.println("You input: " + degC);

		temp = degC * (9.0/5.0) + 32;
		System.out.printf("Temp in degrees F: %.2f\n",temp);
		
		in.close();
		
	}

}
