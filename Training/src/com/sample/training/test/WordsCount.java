package com.sample.training.test;

import java.util.Iterator;

public class WordsCount {

	public static void main(String[] args) {
		String s1 = "Hello I am Vijay";
		String[] strArr = s1.split(" ");
		System.out.println("Number of words in a string: "+strArr.length);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			StringBuilder sb1 = new StringBuilder();
			sb1.append(strArr[i]).reverse().append(" ");
			sb.append(sb1);
		}
		System.out.println(sb.toString());

	}

}
