package com.sample.training.privatemembers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMemberAccess {
	

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> a = PrivateMethods.class;
		Method method = a.getDeclaredMethod("method1", int.class);
		Method method2 = a.getDeclaredMethod("method2");
		method.setAccessible(true);
		method2.setAccessible(true);
		PrivateMethods pm = new PrivateMethods();
		method.invoke(pm, 19);
		method2.invoke(pm);
		//System.out.println(a.getMethods());
	}

}
