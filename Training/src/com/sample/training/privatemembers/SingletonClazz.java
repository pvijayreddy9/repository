package com.sample.training.privatemembers;

public class SingletonClazz {
	private static SingletonClazz instance;
	
	private SingletonClazz() {
		
	}
	public static SingletonClazz getInstance() {
		if(instance == null)
			instance = new SingletonClazz();
		return instance;
	}
	

}
