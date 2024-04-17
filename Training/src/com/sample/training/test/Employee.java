package com.sample.training.test;

import java.util.Comparator;

public class Employee{

	private int id;
	private String name;
	private String gender;
	private int salary;
	
	public Employee(int id, String name,String gender,int salary) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}



	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {
			
			if(e1.getName().compareTo(e2.getName())>0)
				return 1;
			else
				return -1;		
		}
	};
	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {
			
			return 	e1.getSalary()-e2.getSalary();
		}
	};
	
	
	
	
	
	
	
	
}
