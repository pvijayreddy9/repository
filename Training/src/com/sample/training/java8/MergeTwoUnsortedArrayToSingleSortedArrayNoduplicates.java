package com.sample.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayToSingleSortedArrayNoduplicates {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(8,4,9,13,15,35);
		List<Integer> numList1 = Arrays.asList(13,30,9,35,8,4,9);
		List<Integer> joinList = new ArrayList<>();
		joinList.addAll(numList1);
		joinList.addAll(numList);
		joinList=joinList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(joinList);
		
		int[] a = {8,4,9,15};
		int[] b = {13,30,17,35};
		
		int[]sortedArr = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.print(sortedArr[i]+", ");
		}
	}

}
