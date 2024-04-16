package com.sample.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplesOf5FromList {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(8,4,9,15,13,30,17,35);
		List<Integer> multiples = numList.stream().filter(n -> n%5==0).collect(Collectors.toList());
		System.out.println(multiples);
		

	}

}
