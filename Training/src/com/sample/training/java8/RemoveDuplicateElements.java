package com.sample.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		List<Integer> dupList = Arrays.asList(8,4,9,13,16,4,8,13,9);
		List<Integer> uniqueList = dupList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueList);
		
	}

}
