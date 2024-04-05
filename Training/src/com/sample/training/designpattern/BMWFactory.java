package com.sample.training.designpattern;

public class BMWFactory implements CarFactory {

	@Override
	public Car createCar() {
		
		return new BMW();
	}

}
