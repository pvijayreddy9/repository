package com.sample.training.day2;

import java.util.Scanner;

public class StringPalindrome {
	public static boolean stringPalindromeOrNot(String str) {
		String strReverse = "";		
		char ch; 
		for (int i=0; i<str.length(); i++) { 
			ch= str.charAt(i); 
			strReverse= ch+strReverse;
		}		
		System.out.println(strReverse);
		if(str.equals(strReverse)) 
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
