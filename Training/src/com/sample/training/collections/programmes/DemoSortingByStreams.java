package com.sample.training.collections.programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sample.training.exception.Person;

public class DemoSortingByStreams {

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
		//stream().sorted() method is sorting based on comparable so person is already implemented 
		//comparable according to that its sorting.
		listPer.stream().sorted().forEach(p -> System.out.println(p));
		System.out.println();
		System.out.println("List sort by comparator: ");
		listPer.stream().sorted(Person.SalaryCoparator).forEach(p->System.out.println(p));
		//3 Highest Salaries
		List salaries = listPer.stream().skip(listPer.size()-3).collect(Collectors.toList());		
		System.out.println(salaries);
		
		List<Integer> numbers = Arrays.asList(3,8,7,2,9,19,4);
		numbers.stream().filter(i-> i%2 == 0).peek(x->System.out.println("even Number: "+x)).map(n->n*2).forEach(num->System.out.println(num));
		
		

	}

}
