package com.sample.training.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfANumber {

	public static void main(String[] args) {
		int num = 627836;
		int sum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("Sum of All Digits"+sum);

	}

}
