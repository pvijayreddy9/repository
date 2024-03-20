package com.sample.training.collections.programmes;

import java.util.Arrays;
import java.util.List;

public class DifferentWaysOfStreams {

	public static void main(String[] args) {
		//ByUsing Arrays
		int [] strArr = {9,6,5,10,12,17,14,2,19};
		Arrays.stream(strArr).filter(x->x%2!=0).forEach(y->System.out.println("Odd Numbers"+y));
		//From collections
		List<Integer> numbers = Arrays.asList(3,8,7,2,9,19,4);
		numbers.stream().filter(i-> i%2 == 0).peek(x->System.out.println("even Number: "+x))
						.map(n->n*2).forEach(num->System.out.println(num));
		Long num = numbers.stream().count();
		int num3 = numbers.stream().findAny().get();
		
		System.out.println(num3);

	}

}
