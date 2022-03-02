
public class IsDoubloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDoubloon("abba")); //true
		System.out.println(isDoubloon("Anna")); //true
		System.out.println(isDoubloon("ApPeAReR")); //true
		System.out.println(isDoubloon("lloose")); //false
		System.out.println(isDoubloon("aaabbbccc")); //false
		System.out.println(isDoubloon("abcabc")); //true
		

	}
	
	public static boolean isDoubloon(String str) {
		str = str.toLowerCase();
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if(count != 2) {
				return false;
			}
		}
		return true;
	}
}
