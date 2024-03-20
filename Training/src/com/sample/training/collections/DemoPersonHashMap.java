package com.sample.training.collections;

import java.util.HashMap;

import com.sample.training.exception.Person;

public class DemoPersonHashMap {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		HashMap<Person, String> personMap = new HashMap<>();
		
		Person per = new Person("Ravi", 28, "Hyd",90000);
		Person per1 = new Person("Ravi", 28, "Hyd",90000);//(Person) per.clone();
		personMap.put(per, "test");
		personMap.put(per1, "test");
		
		System.out.println(" PersonMap :" + personMap);

	}

}
