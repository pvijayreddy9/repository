package com.sample.training.collections;

import java.util.LinkedList;

public class DemoCollections {

	public static void main(String[] args) {
		CustomArrayList<Integer> customArrayList = new CustomArrayList<>(5);
		customArrayList.add(123);
		customArrayList.add(345);
		customArrayList.add(567);
		customArrayList.add(8910);
		customArrayList.add(101112);
		//System.out.println("Size: "+customArrayList.size());
		customArrayList.add(101113);
		
		//System.out.println("Size: "+customArrayList.size());
		//System.out.println("ArrayList Elements: "+ customArrayList);
		
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("hi");
		list.add("hello");
		list.add("Good Morning");
		list.add("to all");
		
		System.out.println("CustomLinkedList Elements: "+list);
		System.out.println("CustomLinkedList Size: "+list.size());
		System.out.println("CustomLinkedList get an element: "+list.get(3));
		
	}

}
