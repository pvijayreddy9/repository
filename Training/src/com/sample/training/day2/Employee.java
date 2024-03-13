package com.sample.training.day2;

public final class Employee {
	
	    private final String name;
	    private final int age;
	    private final String address;

	    public Employee(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getAddress() {
	        return address;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                ", address='" + address + '\'' +
	                '}';
	    }
	


}
