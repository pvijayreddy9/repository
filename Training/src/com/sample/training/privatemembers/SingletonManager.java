package com.sample.training.privatemembers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonManager {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingletonClazz sig = SingletonClazz.getInstance();
		System.out.println("Hashcode of new instance: "+sig.hashCode());
		Class clazz = SingletonClazz.class;
		Constructor<SingletonClazz> con = clazz.getDeclaredConstructor();
		con.setAccessible(true);
		
		SingletonClazz sg = con.newInstance();
		SingletonClazz sg2 = con.newInstance();
		System.out.println("Hashcode of new instance: " + sg.hashCode());
		System.out.println("Hashcode of new instance: " + sg2.hashCode());

	}

}
