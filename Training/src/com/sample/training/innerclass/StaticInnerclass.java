package com.sample.training.innerclass;

public class StaticInnerclass {
	
	String address = "";
	public void show() {
		System.out.println("in show");
	}
	static class StaticClass {
		public static void config() {
			System.out.println("in config");
		}
	}

	public static void main(String[] args) {
		StaticInnerclass obj = new StaticInnerclass();
		StaticClass obj1 = new StaticClass();
		obj1.config();
		StaticClass.config();

	}

}
