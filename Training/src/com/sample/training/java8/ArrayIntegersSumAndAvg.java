package com.sample.training.java8;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayIntegersSumAndAvg {

	public static void main(String[] args) {
		int[] nums = new int[] {24, 15, 45, 18, 64, 75, 29, 78};
		int sum = Arrays.stream(nums).sum();
		double avg = Arrays.stream(nums).average().getAsDouble();
		System.out.println("Sum: "+sum+" Avg: "+avg);

	}

}
