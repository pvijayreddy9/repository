package com.sample.training.day2;

public class StringPalindrome {
	public static boolean stringPalindromeOrNot(String str) {		
		StringBuilder sb = new StringBuilder(str);				
		System.out.println(sb);
		if(str.equals(sb.reverse().toString())) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {		
		
		String s1 = "radar";
		boolean result = stringPalindromeOrNot(s1);
		if(result)
			System.out.println("String "+s1+" is palindrome");
		else
			System.out.println("String "+s1+" is not palindrome");

	}

}
