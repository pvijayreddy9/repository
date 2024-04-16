package com.sample.training.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringsSortingInIncreasingOrder {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "pear");
		strings.stream().sorted(Comparator.comparing(String::length)).forEach(s1 -> System.out.println(s1));
	}

}
