package com.sample.training.innerclass;

import com.sample.training.innerclass.InnerClass.B;
import com.sample.training.innerclass.StaticInnerclass.StaticClass;

public class Demo {

	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		obj.show();
		B obj1 = obj.new B();
		obj1.config();
		
		StaticInnerclass sic = new StaticInnerclass();
		sic.show();
		StaticClass.config();
	}

}
