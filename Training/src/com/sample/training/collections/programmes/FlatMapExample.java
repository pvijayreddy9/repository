package com.sample.training.collections.programmes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Raju","Naveen","Anand");
		List<String> strList1 = Arrays.asList("Ramu","Swetha","Arun");
		List<String> strList2 = Arrays.asList("chari","Balu","Eswar");
		List<List<String>> s1List = Arrays.asList(strList,strList1,strList2);
		List<List<List<String>>> listsString = Arrays.asList(s1List);
		List<String> list = listsString.stream().flatMap(List::stream).flatMap(List::stream).collect(Collectors.toList());
		System.out.println(list);
	}

}
