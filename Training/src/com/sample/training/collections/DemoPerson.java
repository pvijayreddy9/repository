package com.sample.training.collections;

import java.util.HashMap;

import com.sample.training.exception.Person;

public class DemoPerson {

	private static final Object PRESENT = new Object();
	public static void main(String[] args) {
		HashMap<Person, Object> personMap = new HashMap<>();
		
		Person per = new Person("Ravi", 28, "Hyd");
		Person per1 = new Person("Ravi", 28, "Hyd");
		personMap.put(per, PRESENT);
		personMap.put(per1, PRESENT);
		
		System.out.println(" PersonMap :" + personMap);

	}

}
