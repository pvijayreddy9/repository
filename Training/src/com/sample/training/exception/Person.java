package com.sample.training.exception;

import java.util.Comparator;

public class Person implements Comparable<Person>, Cloneable{
	private String name;
    private  int age;
    private String address;
    private int salary;

    public Person(String name, int age, String address, int salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
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
    

    public int getSalary() {
		return salary;
	}

	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", salary=" + salary + "]";
	}
	
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		result = prime*result+((name==null)?0:name.hashCode());		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
        Person other = (Person) obj;        
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
	}


	public static Comparator<Person> AgeComparator = new Comparator<Person>() {
		
		@Override
		public int compare(Person p1, Person p2) {
			
			return (p1.getAge()-p2.getAge());
		}
	};
	public static Comparator<Person> SalaryCoparator = new Comparator<Person>() {
		
		@Override
		public int compare(Person p1, Person p2) {
			
			return (p1.getSalary()-p2.getSalary());
		}
	};
	
	public static Comparator<Person> NameCoparator = new Comparator<Person>() {

		@Override
		public int compare(Person p1, Person p2) {
			
			return p1.getName().compareTo(p2.getName());
		}
	};

	@Override
	public int compareTo(Person o) {
		
		return this.name.compareTo(o.name);
	}
	
}
