
public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Red",0,0,"0000000002");
		System.out.println(car.drive(20, 50));
		car.drive(20);
		System.out.println(car.toString());
		Vehicle veh = new Vehicle();
		System.out.println(veh.toString());
	}

}
