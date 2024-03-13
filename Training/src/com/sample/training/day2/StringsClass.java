package com.sample.training.day2;

public class StringsClass {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		
		String s1 = "Hello";
		String s2 = "New Hello";
		
		boolean b1 = s1.equals(s2);
		boolean b2 = (s1==s2);
		System.out.println("Compare two Strings");
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		
		String str1 = new String("hello");
        String str2 = "hello";
        String str3 = str1.intern();

        System.out.println("Intern() example");
        System.out.println("s1 == s2: " + (str1 == str2)); 
        System.out.println("s2 == s3: " + (str2 == str3)); 
		
	}

}
