
public class StringKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(endOther("Hiabc","abc"));
		System.out.println(endOther("AbC","HiaBc"));
		System.out.println(endOther("abc","abXabc"));
		System.out.println(endOther("aaa","aaa"));
		System.out.println(endOther("CAB","abc"));

	}

	public static boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.endsWith(b)) {
			return true;
		}
		if(b.endsWith(a)) {
			return true;
		} else {
			return false;
		}
	}
	
}
