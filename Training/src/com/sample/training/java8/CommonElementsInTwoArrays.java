package com.sample.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(8,4,9,13,15,35);
		List<Integer> numList1 = Arrays.asList(13,30,9,35,8,4,9);
		
		List<Integer> commonList = numList.stream().filter(numList1::contains).collect(Collectors.toList());
		System.out.println(commonList);

	}

}
