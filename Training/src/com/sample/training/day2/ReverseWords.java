package com.sample.training.day2;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "hello every one";
		String[] strArray = str.split(" ");
		String str2 = "";
		for (int i=0; i<strArray.length; i++) {			 
			str2= strArray[i]+" "+str2;
		}
		System.out.println("Normal words: "+str);
		System.out.println("Reversed words: "+str2);

	}

}
