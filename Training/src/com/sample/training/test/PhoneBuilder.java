package com.sample.training.test;

public class PhoneBuilder {
	
	private String os;
	private double screenSize;
	private int battery;
	private int camera;
	
	
	

	

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	

	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	

	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, screenSize, battery, camera);
		
	}
	
	
}
