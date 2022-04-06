import java.util.Arrays;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[4];
		vehicles[0] = new Car("Red", 0, 60, "205839024");
		vehicles[1] = new Truck(32, 0, 50, "97840406");
		vehicles[2] = new Car("Green", 0, 60, "3324024");
		vehicles[3] = new Vehicle(0, 35, "5421368");
		System.out.println(Arrays.toString(vehicles));
		
		
		for(Vehicle veh : vehicles) {
			if(veh instanceof Truck) {
				System.out.println( ((Truck)veh).getBedLength());
			}
		}
	}

}
