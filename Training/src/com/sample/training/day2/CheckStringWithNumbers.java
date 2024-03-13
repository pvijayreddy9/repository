package com.sample.training.day2;

public class CheckStringWithNumbers {

	public static void main(String[] args) {
		String str = "hello every one";
		boolean result = false;
		for(char c:str.toCharArray()) {
			result = Character.isDigit(c);
			if(result) {
				System.out.println("This String contains numbers");
				break;
			}
				
		}
		if(!result)
			System.out.println("There are no numbers in the string");
		
		

	}

}
