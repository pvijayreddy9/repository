package com.sample.training.test;

import java.util.Comparator;

public class Employee{

	private int id;
	private String name;
	private String gender;
	
	public Employee(int id, String name,String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + "]";
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
	
	
	
	
	
	
	
	
}
