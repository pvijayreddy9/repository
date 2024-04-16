package com.sample.training.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNuberInArray {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(8,4,9,13,15,35);
		int secondLargest = numList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargest);

	}

}
