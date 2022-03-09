
public class LogicKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(greenTicket(1, 2, 3));
		System.out.println(greenTicket(2,2,2));
		System.out.println(greenTicket(1,1,2));
		System.out.print("\n");
	
		System.out.println(makeChocolate(4, 1, 9));
		System.out.println(makeChocolate(4, 1, 10));
		System.out.println(makeChocolate(4, 1, 7));
		System.out.println(makeChocolate(9, 0, 9));
	}

	public static int greenTicket(int a, int b, int c) {
		if(a == b && b == c) {
			return 20;
		} else if ( a == b || a == c || b == c) {
			return 10;
		} else {
			return 0;
		}
	}
	
	public static int makeChocolate(int small, int large, int goal) {
		int total = large * 5;
		for(int i = 0; i <= small; i++) {
			if(total + i == goal) {
				return i;
			}
		}
		return -1;
	}
}
