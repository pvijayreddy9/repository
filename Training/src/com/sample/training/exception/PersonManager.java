package com.sample.training.exception;

import java.util.Arrays;
import java.util.List;

public class PersonManager {
	
	

	public static void main(String[] args) {
		Person per = new Person("Ravi", 14, "123 hyd",98765);
		
		/*if(per.getAge() < 18) {
			throw new ArithmeticException("Person is a minor");
		}else {
			System.out.println("Peson is major");
		}*/
		List<Person> voterList = Arrays.asList(new Person("Ravi", 27, "123 hyd",98723),new Person("karthik", 18, "123 hyd",546785),new Person("Raju", 14, "123 hyd",76548));
		for (int i = 0; i < voterList.size(); i++) {
			
			if(voterList.get(i).getAge() < 18) {
				throw new ArithmeticException("Person "+voterList.get(i).getName()+" is minor not eligible for voter Id");
			}else {
				System.out.println("Person "+voterList.get(i).getName()+" is major");
			}
			
		}
	}

}
