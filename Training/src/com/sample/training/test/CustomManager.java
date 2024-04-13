package com.sample.training.test;

public class CustomManager {

	public static void main(String[] args) {
		CustomArrayList<Integer> arList =  new CustomArrayList<>();
		arList.add(9);
		arList.add(5);
		arList.add(6);
		System.out.println(arList.get(1));
		CustomLinkelist<Integer> LList =  new CustomLinkelist<>();
		LList.add(54);
		LList.add(57);
		LList.add(66);
		System.out.println(LList.get(2));

	}

}
