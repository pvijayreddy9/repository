package com.sample.training.designpattern;

public class BenzFactory implements CarFactory {

	@Override
	public Car createCar() {
		
		return new Benz();
	}

}
