package com.sample.training.collections.programmes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sample.training.exception.Person;

public class DemoSortingByComparator {

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
		listPer.add(new Person("Mounika", 36, "",350000));		
		listPer.add(new Person("Chaitanya", 49, "",250000));
		listPer.add(new Person("Sandhya", 29, "",50000));
		listPer.add(new Person("Harsha", 28, "",80000));
		listPer.add(new Person("Jaswanth", 38, "",95000));
		listPer.add(new Person("Pradeep", 13, "",15000));
		listPer.add(new Person("Balu", 29, "",35000));
		listPer.add(new Person("Dinesh", 54, "",40000));
		listPer.add(new Person("Eswanth", 27, "",85000));
		listPer.add(new Person("Firoz", 38, "",95000));
		
		Collections.sort(listPer, Person.AgeComparator);
		System.out.print("List Person Age sorting: ");
		for (Person person : listPer) {
			System.out.println(person);
		}
		System.out.println();
		Collections.sort(listPer, Person.NameCoparator);
		System.out.print("List Person Name sorting: ");
		for (Person person : listPer) {
			System.out.println(person);
		}
		System.out.println();
		Collections.sort(listPer, Person.SalaryCoparator);
		System.out.print("List Person Salary sorting: ");
		for (Person person : listPer) {
			System.out.println(person);
		}
		List salary = listPer.stream().skip(listPer.size()-3).collect(Collectors.toList());
		System.out.println(salary);

	}

}
