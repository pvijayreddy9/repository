package com.sample.training.test;

import java.util.Arrays;
import java.util.List;

public class SecondLargestSalary {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "vijay", "M", 1000),
				new Employee(1, "Ravi", "M", 5000),new Employee(1, "Harsha", "M", 2000));
		Employee emp = empList.stream().sorted(Employee.salaryComparator.reversed()).skip(1).findFirst().get();
		
		System.out.println(emp);
		

	}

}
