import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isAnagram("abba","baba")); //expected: true
		System.out.println(isAnagram("racecar","ecarrac")); //expected: true
		System.out.println(isAnagram("abcd","abcg")); //expected: false
		
	}
	
	public static boolean isAnagram(String a, String b) {
		int[] histA = letterHist(a);
		int[] histB = letterHist(b);
		
		for(int i = 0; i < histA.length; i++) {
			if(histA[i] != histB[i]) {
				return false;
			}
		}
		return true;
	}

	// Return an array of how many times in a string each letter of the alphabet appears
	public static int[] letterHist(String s) {
		
		int hist[] = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			char letterAtIndex = s.charAt(i);
			int histIndex = getIndexForCharacter(letterAtIndex);
			
			hist[histIndex]++;
		}
		
		return hist;
		
	}
	
	public static int getIndexForCharacter(char letter) {
		int i = 0;
		for(char comparison = 'a'; comparison <= 'z'; comparison++) {
			if(letter == comparison) {
				return i;
			}
			i++;
		}
		return i;
	}
	
	
	
}
