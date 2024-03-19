package com.sample.training.collections.programmes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sample.training.exception.Person;

public class DemoSortingByComparable {

	public static void main(String[] args) {
		List<Person> listPer = new ArrayList<>();
		listPer.add(new Person("Ravi", 19, "",20000));
		listPer.add(new Person("Anand", 23, "",12000));
		listPer.add(new Person("Swetha", 21, "",30000));
		listPer.add(new Person("Lokesh", 57, "",200000));
		listPer.add(new Person("Ramu", 45, "",150000));
		listPer.add(new Person("Goutham", 40, "",300000));
		listPer.add(new Person("vijay", 32, "",90000));
		listPer.add(new Person("Surya", 60, "",400000));
		
		Collections.sort(listPer);
		for (Person person : listPer) {
			System.out.println("List Person"+person);
		}

	}

}
