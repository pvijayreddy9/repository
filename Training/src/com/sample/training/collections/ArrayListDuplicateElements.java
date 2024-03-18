package com.sample.training.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListDuplicateElements {
	
	public static HashSet<String> duplicateElements(ArrayList<String> list){
		
		HashSet<String> set = new HashSet<>();
		for (String string : list) {
			set.add(string);
		}		
		return set;
	}
	public static HashMap<String, Integer> duplicateElementsCount(ArrayList<String> list){
		HashMap<String, Integer> duplicateCount = new HashMap<>();
		
		for (String string : list) {
			int count = 0;
			for (int i = 1; i < list.size(); i++) {
			
				if(string.equals(list.get(i))) {
					count++;
										
				}
				duplicateCount.put(string, count);					
			}
		}	
		
		return duplicateCount;
	}

	private static ArrayList<String> duplicateElementsByArraylist(ArrayList<String> list) {
		ArrayList<String> listWithoutDuplicates = new ArrayList<>();
		for (String string : list) {
			if(!listWithoutDuplicates.contains(string)) {
				listWithoutDuplicates.add(string);
			}
		}
		return listWithoutDuplicates;
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Arun");
		list.add("Aditya");
		list.add("Ramu");
		list.add("Vijay");
		list.add("Chaitanya");
		list.add("Vijay");
		list.add("Arun");
		list.add("Chaitanya");
		list.add("Ramu");
		list.add("Chaitanya");
		
		//HashSet<String> set = duplicateElements(list);
		//System.out.println("unique elements: " + set);
		
		HashMap<String, Integer> duplicateCount = duplicateElementsCount(list);
		System.out.println();
		System.out.println("Count of each element duplicated"+duplicateCount);
		ArrayList<String> UniqueList = duplicateElementsByArraylist(list);
		System.out.println();
		System.out.println("unique elements: "+UniqueList);
		

	}
	

}
