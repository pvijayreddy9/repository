
public class ReverseString {

	public static void main(String[] args) {
		String str = "hello";
		String strReverse = "";
		char ch; 
		System.out.println("Normal String: "+str);
		for (int i=0; i<str.length(); i++) { 
			ch= str.charAt(i); 
			strReverse= ch+strReverse;
		}
		System.out.println("reversed String: "+strReverse);

	}

}
