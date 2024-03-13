package com.sample.training.day2;

import java.util.logging.Logger;

public class EmplyeeManager {

	public static void main(String[] args) {
		Employee emp = new Employee("Vijay", 23, "123, abc");
		System.out.println(EmployeeConstants.Employee_Immutable_Class);
		System.out.println(EmployeeConstants.EMPLOYEE+" "+emp.toString());

	}

}
