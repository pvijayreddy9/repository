package com.sample.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInAnArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8,4,9,13,16,4,8,4,9,13,9,8);
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
