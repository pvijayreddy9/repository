package com.sample.training.java8;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinInAList {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(8,4,9,15,13,30,17,35);
		System.out.println(numList.stream().max((o1, o2) -> o1>o2?1:-1).get());
		System.out.println(numList.stream().max((o1, o2) -> o1<o2?1:-1).get());

	}

}
