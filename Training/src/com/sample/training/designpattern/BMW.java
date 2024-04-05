package com.sample.training.designpattern;

public class BMW implements Car {

	@Override
	public void engineSpecs() {
		System.out.println("3300cc");

	}

	@Override
	public void carModel() {
		
		System.out.println("E3540");
	}

	@Override
	public void carFeatures() {
		System.out.println("BMW: GPS,Audio,Display,Interior with Leather finish,Manual");

	}

}
