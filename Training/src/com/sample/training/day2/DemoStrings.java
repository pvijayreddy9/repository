package com.sample.training.day2;

import java.util.StringJoiner;

public class DemoStrings {
	public static void typesOfFruit(String fruit) {
		switch(fruit) 
		   { 
		       case "Mango": 
		    	   System.out.println("Sweet"); 
		    	   break; 
			   case "Apple": 
			       System.out.println("Delicious"); 
			       break; 
			   case "Orange": 
			       System.out.println("Luscious"); 
			       break; 
			   default: 
			       System.out.println("Not a fruit"); 
		   }
	}

	public static void main(String[] args) {
		String s1 = new String("Hello world and good Morning").intern();
		String s2 = "Hello world and good morning".intern();
		String s3 = s1;
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.equalsIgnoreCase(s2));
		System.out.println(s3.equals(s1));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.subSequence(0, 10));
		typesOfFruit("Mango");
		
		StringJoiner sj = new StringJoiner(",", "[", "]");
		
	   sj.add("Welcome");
	   sj.add("to");
	   sj.add("My world");
	   //String[] str = sj.;
	   System.out.println(sj);

	}

}
