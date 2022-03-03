
public class Scrabble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canSpell("jiqbui","qui")); //expected: true actual: true
		System.out.println(canSpell("jibui","qui")); //expected: false actual: false
		System.out.println(canSpell("jiqbui","qqui")); //expected: false actual: false
		System.out.println(canSpell("jiqqbui","qqui")); //expected: true actual: true
	}

	//This is so much easier than it sounds when you just think about it for a minute..
	public static boolean canSpell(String haystack, String needle) {
		
		
		for(int i = 0; i < needle.length(); i++) {
			
			int foundInNeedle = 0;
			int foundInHaystack = 0;
			
			for(int iNeedle = 0; iNeedle < needle.length(); iNeedle++) {
				
				if(needle.charAt(iNeedle) == needle.charAt(i)) {
					foundInNeedle++;
				}
			}
			for(int iHaystack = 0; iHaystack < haystack.length(); iHaystack++) {
				if(haystack.charAt(iHaystack) == needle.charAt(i)) {
					foundInHaystack++;
				}
			}
			
			if(foundInHaystack < foundInNeedle) {
				return false;
			}
		}
		return true;
		
	}
	
}
