package com.sample.training.day2;

import java.util.Iterator;

public class OvalsInString {

	public static void main(String[] args) {
		int count = 0;
		String str = "hello every one in java";
		String[] strArr = {"a","e","i","o","u"};
		StringBuilder sb = new StringBuilder();
		/*for(int i=0;i<strArr.length;i++) {
			boolean result = str.contains(strArr[i]);
			if(result)
				sb.append(strArr[i]+" ");
		}*/
		
		for(int i=0;i<str.length();i++) {							
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e'||
					str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
				count++;
			}
			
		}
		System.out.println("Ovals count in a String: "+count);

	}

}
