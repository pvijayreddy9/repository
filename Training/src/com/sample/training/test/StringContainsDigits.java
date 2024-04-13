package com.sample.training.test;

public class StringContainsDigits {

	public static void main(String[] args) {
		String s1 = "agtl";
		boolean b = false;
		for (Character c : s1.toCharArray()) {
			
			if(c.isDigit(c)) {
				System.out.println("string contains Numbers");
				b=true;
				return;
			}else {
				b=false;
			}
		}
		System.out.println();

	}

}
