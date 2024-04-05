package com.sample.training.designpattern;

public class Benz implements Car {

	@Override
	public void engineSpecs() {
		System.out.println("3600cc");

	}

	@Override
	public void carModel() {
		
		System.out.println("A3540");
	}

	@Override
	public void carFeatures() {
		System.out.println("Benz: GPS, Audio, Display, Interior with Leather finish, Automatic");

	}

}
