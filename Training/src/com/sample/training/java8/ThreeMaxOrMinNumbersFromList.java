package com.sample.training.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaxOrMinNumbersFromList {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(8,4,9,13,15,35,29,19);
		List<Integer> maxList = numList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		List<Integer> minList = numList.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println("Max 3: "+maxList);
		System.out.println("Min 3: "+minList);
	}

}
