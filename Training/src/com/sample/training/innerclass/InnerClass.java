package com.sample.training.innerclass;


public class InnerClass {

	int age;
	
	public void show() {
		System.out.println("in Show");
	}
	class B{
		public void config() {
			System.out.println("in config");
		}
	}
	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		obj.show();
		
		B obj1 = obj.new B();
		obj1.config();
	}

}
