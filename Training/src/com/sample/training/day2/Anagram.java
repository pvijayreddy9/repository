package com.sample.training.day2;

import java.util.Arrays;

public class Anagram {
	
	static boolean areAnagram(char[] str1, char[] str2)
    {
       
        int n1 = str1.length;
        int n2 = str2.length;        
        if (n1 != n2)
            return false;
        
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        boolean result = Arrays.equals(str1, str2);
        
 
        return result;
    }

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";		
		
		if(areAnagram(s1.toCharArray(), s2.toCharArray()))
			System.out.println(s1 + " and " + s2 + " are anagrams.");
		else
			System.out.println(s1 + " and " + s2 + " are not anagrams.");

	}

}
