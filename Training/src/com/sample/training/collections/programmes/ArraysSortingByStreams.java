package com.sample.training.collections.programmes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysSortingByStreams {

	public static void main(String[] args) {
		String [] strArr = {"Raju","Naveen","Anand","Swetha","Arun"};
		List<String> strList = Arrays.asList(strArr);
		List<String> sortedList = strList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
