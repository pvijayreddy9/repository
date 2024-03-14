package com.sample.training.day2;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "hello every one";
		
		StringBuilder str2 = new StringBuilder(str);
		str2.reverse();		
		System.out.println("Normal words: "+str);
		System.out.println("Reversed words: "+str2);

	}

}
