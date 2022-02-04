
public class Time {

	public static void main(String[] args) {
		
		int hour = 11;
		int minute = 47;
		int second = 23;
		
		int secPerMin = 60;
		int secPerHr = 3600;
		int secPerDay = 86400;
		int secSinceMidnight = (hour*secPerHr) + (minute*secPerMin) + second;
		int secUntilTomorrow = secPerDay - secSinceMidnight;
		
		System.out.println("The time since midnight is " + secSinceMidnight + " seconds.");
		System.out.println("The time until tomorrow is " + secUntilTomorrow + " seconds.");
		System.out.printf("The current time is %02d:%02d:%02d.\n",hour,minute,second);
	}
	
}