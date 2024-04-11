package com.sample.training.designpattern.builderdesign;

public class PhoneManager {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setOs("Android").setProcessor("snapdragon").setBattery(4000).setScreenSize(6.7).getPhone();
		
		System.out.println(phone);

	}

}
