package com.sample.training.exception;

public interface MyFunctionalInterface {

	public void method1();
	default void method2() {
		System.out.println("this is default method in interface");
	}
}
