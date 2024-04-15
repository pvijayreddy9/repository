package com.sample.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeperateOddAndEven {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(8,4,9,13,16,17,32,35);
		List<Integer> evenNum = numList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		List<Integer> oddNum = numList.stream().filter(n -> n%2!=0).collect(Collectors.toList());
		
		System.out.println("Even Number: " + evenNum);
		System.out.println("Odd Number: " + oddNum);
 	}

}
