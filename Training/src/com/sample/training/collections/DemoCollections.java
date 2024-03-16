package com.sample.training.collections;

public class DemoCollections {

	public static void main(String[] args) {
		CustomArrayList<Integer> customArrayList = new CustomArrayList<>(5);
		customArrayList.add(123);
		customArrayList.add(345);
		customArrayList.add(567);
		customArrayList.add(8910);
		customArrayList.add(101112);
		System.out.println("Size: "+customArrayList.size());
		customArrayList.add(101113);
		
		System.out.println("Size: "+customArrayList.size());
		System.out.println("ArrayList Elements: "+ customArrayList);
	}

}
