package com.sample.training.test;

public class PhoneManager {

	public static void main(String[] args) {
		Phone ph = new PhoneBuilder().setBattery(3000).setCamera(108).setOs("Android").getPhone();
		System.out.println(ph);

	}

}
