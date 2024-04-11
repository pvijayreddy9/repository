package com.sample.training.test;
import java.util.HashMap;

public class Manager {

	public static void main(String[] args) {
		String s1 = "abadbde";
		HashMap<Character, Integer> countMap = new HashMap<>();
		
		for (char c : s1.toCharArray()) {
			int i = 1;
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			}else {
				countMap.put(c, 1);
			}
		}
		System.out.println("count of alphabets: " + countMap);

	}

}
