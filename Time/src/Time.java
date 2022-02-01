
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//started at 11:44
		//finished 12:05
		int hour = 12;
		int minute = 0;
		int second = 0;
		
		int secPerMin = 60;
		int secPerHr = 3600;
		int secPerDay = 86400;
		int secSinceMidnight = (hour*secPerHr) + (minute*secPerMin) + second;
		int secUntilTomorrow = secPerDay - secSinceMidnight;
		System.out.println("The time since midnight is " + secSinceMidnight + " seconds.");
		System.out.println("The time until tomorrow is " + secUntilTomorrow + " seconds.");
		System.out.println("The current time is " + format(hour) + ":" + format(minute) + ":" + format(second) + ".");
	}
	
	public static String format(int digits) {
		String padded = "" + digits;
		if(digits < 10) {
			padded = "0" + digits;
		}
		return padded;
	}
}