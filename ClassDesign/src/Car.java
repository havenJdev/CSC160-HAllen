
public class Car {
	private String color;
	private double amountOfGas;
	private int mileage;
	
	public Car() {
		color = "Grey";
		amountOfGas = 10;
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, double amountOfGas) {
		super();
		this.color = color;
		this.amountOfGas = amountOfGas;
	}

	public Car(String color, double amountOfGas, int mileage) {
		super();
		this.color = color;
		this.amountOfGas = amountOfGas;
		this.mileage = mileage;
	}

	public double getAmountOfGas() {
		return amountOfGas;
	}

	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
	
	
}
