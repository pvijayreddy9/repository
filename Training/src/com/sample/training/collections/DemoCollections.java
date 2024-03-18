package com.sample.training.collections;

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
		//System.out.println("CustomArrayList");
		//System.out.println("Size: "+customArrayList.size());
		//System.out.println("ArrayList Elements: "+ customArrayList);
		
		//CustomLinkedList
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("hi");
		list.add("hello");
		list.add("Good Morning");
		list.add("to all");
		System.out.println();
		System.out.println("CustomLinkedList Elements: ");
		System.out.println("CustomLinkedList Elements: "+list);
		System.out.println("CustomLinkedList Size: "+list.size());
		System.out.println("CustomLinkedList get an element: "+list.get(3));
		
		//CustomHashMap
		CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println();
        System.out.println("CustomMap");
        System.out.println("Map: " + map);
        System.out.println("Size: " + map.size());
        System.out.println("Value for key 'two': " + map.get("two"));
        
        //CustomHashSet
        CustomHashSet<Integer> set = new CustomHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println();
        System.out.println("CustomHashSet: ");
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Contains 2? " + set.contains(2));
        set.remove(2);
        System.out.println("Set after removing 2: " + set);
        System.out.println("Is set empty? " + set.isEmpty());
        set.clear();
        System.out.println("Set after clearing: " + set);
		
	}

}
