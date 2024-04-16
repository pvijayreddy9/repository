package com.sample.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfStringsWithPrefixAndSuffix {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple","Mango","Grapes","Pinapple");
		
		List<String> strList2 = strList.stream().map(s -> "The "+s+" is a fruit").collect(Collectors.toList());
		System.out.println(strList2);

	}

}
