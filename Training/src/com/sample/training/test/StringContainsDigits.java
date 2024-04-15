package com.sample.training.test;

public class StringContainsDigits {

	public static void main(String[] args) {
		String s1 = "agtl";
		boolean b = false;
		for (Character c : s1.toCharArray()) {
			
			if(c.isDigit(c)) {				
				b=true;
				return;
			}else {
				b=false;
			}
		}
		if(b) 
			System.out.println("string contains Numbers");
		else
			System.out.println("string doesn't contains Numbers");
		

	}

}
