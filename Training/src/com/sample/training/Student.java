package com.sample.training;

public class Student {
	 private String name;
	    private int age;
	    private String department;

	    // Default constructor
	    public Student() {
	        this.name = "Unknown";
	        this.age = 0;
	        this.department = "Unknown";
	    }

	    // Constructor with name and age
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	        this.department = "Unknown";
	    }

	    // Constructor with name, age, and department
	    public Student(String name, int age, String department) {
	        this.name = name;
	        this.age = age;
	        this.department = department;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getDepartment() {
	        return department;
	    }

}
