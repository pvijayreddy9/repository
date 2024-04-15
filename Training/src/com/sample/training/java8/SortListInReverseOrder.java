package com.sample.training.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInReverseOrder {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(8,4,9,16,13,32,17,35);
		List<Integer> sortedList = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("SortedList in Reverse Order: "+sortedList);
	}

}
