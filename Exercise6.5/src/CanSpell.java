
public class CanSpell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canSpell("quijibo","qqui"));
	}

	public static boolean canSpell(String haystack, String needle) {
		boolean check = false;
		for(int i = 0; i < needle.length(); i++) {
			check = false;
			for(int j = 0; j < haystack.length(); j++) {
				if(haystack.charAt(j) == needle.charAt(i)) {
					check = true;
					System.out.println(haystack);
					haystack = haystack.substring(0,j) + haystack.substring(j+1,haystack.length());
					System.out.println(haystack);
				}
			}
		}
		
		return check;
	}
	
}
