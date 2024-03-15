package com.sample.training.exception;

public class ExceptionChain {

	public static void main(String[] args) {
		try {
			//For exception chain uncomment below line
			//A.method1();
			int n = 10/0;
			String str = null;
			System.out.println(str.length());
			
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage().concat(" Arithmatic Exception, we should not divide by zero"));
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
