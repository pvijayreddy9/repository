import java.util.Arrays;

public class Anagram {

	public static boolean checkAnagram(char[] chArr1,char[] chArr2) {
		
		if(chArr1.length == chArr2.length)
			return true;
		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		if(chArr1.equals(chArr2))
			return true;
		
		return false;
	}
	public static void main(String[] args) {
		String s1 = "aabaa";
		String s2 = "abbaaa";
		System.out.println(checkAnagram(s1.toCharArray(), s2.toCharArray()));
			
	}

}
