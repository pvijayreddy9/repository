package com.sample.training.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str = "hello";
		StringBuilder strReverse = new StringBuilder(str);
		char ch; 
		System.out.println("Normal String: "+str);
		strReverse.reverse();
		System.out.println("reversed String: "+strReverse.toString());

	}

}
