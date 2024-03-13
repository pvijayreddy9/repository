package com.sample.training.day2;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuffer sbuffer = new StringBuffer("Hi hello");
		sbuffer.append(" every one ");
		sbuffer.append('c');
		sbuffer.append(958467825);
		
		System.out.println("StringBuffer result:"+sbuffer);
		
		StringBuilder sbuilder = new StringBuilder("Strings");
		sbuilder.append(" are Immutable");
		sbuilder.append(sbuffer);
		System.out.println(sbuilder.capacity());
		System.out.println(sbuilder.indexOf("Immutable"));
		System.out.println(sbuilder.lastIndexOf("are"));
		System.out.println(sbuilder.lastIndexOf("are",13));
		
		System.out.println("StringBuilder result:"+sbuilder);

	}

}
