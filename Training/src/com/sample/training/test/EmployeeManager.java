package com.sample.training.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeManager {
	
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "Raju","M",7000),new Employee(1, "Rani","F",7000),
				new Employee(1, "Vijay","M",7000),new Employee(1, "Swetha","F",7000),new Employee(1, "Ravi","M",7000),
				new Employee(1, "Mounika","F",7000));
		
		List<Employee> empMaleList = empList.stream().filter(emp->emp.getGender().equals("M")).collect(Collectors.toList());
		Map<String, Long> genderCountMap = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderCountMap);
	}

}
