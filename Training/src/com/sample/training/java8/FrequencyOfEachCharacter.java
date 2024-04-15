package com.sample.training.java8;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {
		String str = "khauiakh sbafui sbkhui";
		Map<Character,Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println("Frequency Of Characters: " + map);

	}

}
