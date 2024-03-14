package com.sample.training.exception;

public class OutOfBoundsException {

	public static void main(String[] args) {
		try {		
			String[] array =  {"a","b","c"};
			String str = array[3];
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
