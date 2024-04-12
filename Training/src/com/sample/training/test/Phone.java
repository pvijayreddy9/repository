package com.sample.training.test;

public class Phone {

	private String os;
	private double screenSize;
	private int battery;
	private int camera;
	
	public Phone(String os, double screenSize, int battery, int camera) {
		super();
		this.os = os;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}

	public String getOs() {
		return os;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public int getBattery() {
		return battery;
	}

	public int getCamera() {
		return camera;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", screenSize=" + screenSize + ", battery=" + battery + ", camera=" + camera + "]";
	}
	
	
	
	
}
