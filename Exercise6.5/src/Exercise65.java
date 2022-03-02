
public class Exercise65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDoubloon("abba"));
		System.out.println(isDoubloon("Anna"));
		System.out.println(isDoubloon("ApPeAReR"));
		

	}
	
	public static boolean isDoubloon(String str) {
		str = str.toLowerCase();
		
		int count = 0;
		
		for(int i = 0; i < str.length()-1; i++) {
			for(int j = i+1; i < str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
	}

}
