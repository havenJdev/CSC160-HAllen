import java.util.Objects;

public class Car extends Vehicle {

	private String trim;

	public Car(String trim, int minSpeed, int maxSpeed, String vin) {
		super(minSpeed, maxSpeed, vin);
		this.trim = trim;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}
	
	public int drive(int miles, int fuel) {
		super.drive(miles);
		return fuel - miles;
	}

	@Override
	public String toString() {
		return "Car [trim=" + trim + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(trim, other.trim);
	}

}
