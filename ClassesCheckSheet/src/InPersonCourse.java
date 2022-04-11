
public class InPersonCourse extends Course{
	private String roomNumber;

	public InPersonCourse(String courseNum, int numStudents, int maxStudents, int credits, String roomNumber) {
		super(courseNum, numStudents, maxStudents, credits);
		this.roomNumber = roomNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nroomNumber=" + roomNumber;
	}
}
