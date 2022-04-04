public class Vehicle {
	private int minSpeed;
	private int maxSpeed;
	private String vin;
	
	public Vehicle()
	{
		this.minSpeed = 0;
		this.maxSpeed = 60;
		this.vin = "00000000001";
	}
	
	public Vehicle(int maxSpeed) {
		super();
		this.minSpeed = 0;
		this.maxSpeed = maxSpeed;
		this.vin = "00000000001";
	}

	public Vehicle(int minSpeed, int maxSpeed) {
		super();
		this.minSpeed = minSpeed;
		this.maxSpeed = maxSpeed;
		this.vin = "00000000001";
	}

	public Vehicle(int minSpeed, int maxSpeed, String vin) {
		super();
		this.minSpeed = minSpeed;
		this.maxSpeed = maxSpeed;
		this.vin = vin;
	}

	public int getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	
	public void drive(int miles) {
		System.out.println("+".repeat(miles));
	}

	public String toString() {
		return "Vehicle [minSpeed=" + minSpeed + ", maxSpeed=" + maxSpeed + ", vin=" + vin + "]";
	}
	
}
