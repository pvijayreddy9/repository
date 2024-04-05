package com.sample.training.designpattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		BenzFactory benzFact = new BenzFactory();
		Benz benz = (Benz) benzFact.createCar();
		benz.carFeatures();
		BMWFactory bmwFact = new BMWFactory();
		BMW bmw = (BMW) bmwFact.createCar();
		bmw.carFeatures();
	}
}
