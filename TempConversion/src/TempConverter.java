import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		double userValue;
		String degreeType;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Degree unit (F/C): ");
		degreeType = in.nextLine();
		
		if ( degreeType.toLowerCase().equals("f") ) {
			System.out.print("\nDegrees F: ");
			userValue = in.nextDouble();
			System.out.printf("Temp in degrees C: %.2f\n", fahrenheitToCelsius(userValue));
		} else if ( degreeType.toLowerCase().equals("c") ) {
			System.out.print("\nDegrees C: ");
			userValue = in.nextDouble();
			System.out.printf("Temp in degrees F: %.2f\n", celsiusToFahrenheit(userValue));
		} else {
			System.out.println("Something went wrong");
		}
		
		in.close();
		
	}
	
	//My favorite part about java is how I don't have to prototype methods. God bless
	public static double fahrenheitToCelsius(double degF) {
		
		return (degF - 32.0) * (5.0/9.0);
	}
	public static double celsiusToFahrenheit(double degC) {
		
		return degC * (9.0/5.0) + 32;
	}

}
