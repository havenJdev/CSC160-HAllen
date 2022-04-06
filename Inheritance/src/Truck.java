
public class Truck extends Vehicle {
	private int bedLength;
	
	public Truck() {
		super();
	}

	public Truck(int bedLength) {
		super();
		this.bedLength = bedLength;
	}
	
	public Truck(int bedLength, int minSpeed, int maxSpeed, String vin) {
		super(minSpeed, maxSpeed, vin);
		this.bedLength = bedLength;
		// TODO Auto-generated constructor stub
	}

	public Truck(int bedLength, int minSpeed, int maxSpeed) {
		super(minSpeed, maxSpeed);
		this.bedLength = bedLength;
		
		// TODO Auto-generated constructor stub
	}


	public int getBedLength() {
		return bedLength;
	}

	public void setBedLength(int bedLength) {
		this.bedLength = bedLength;
	}

//	@Override
//	public String toString() {
//		return "Truck [bedLength=" + bedLength + "]";
//	}
	
	
}
