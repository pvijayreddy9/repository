package com.sample.training.exception;

public class SingleTonClass {
	private static SingleTonClass instance;
	private SingleTonClass() {
		
	}
	
	public static SingleTonClass getInstance() {
		instance = new SingleTonClass();
		return instance;
	}
}
