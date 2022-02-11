import java.util.Scanner;

public class CylinderVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double area = computeArea(scanner.nextDouble());
		System.out.println("Area: " + area);
		
		System.out.print("Enter the height: ");
		double volume = computeVolume(area,scanner.nextDouble());
		System.out.println("Volume: " + volume);
		
		scanner.close();
	}
	
	public static double computeArea(double radius) {
		return radius * radius * Math.PI;
	}

	public static double computeVolume(double area, double height) {
		return area * height;
	}
}
