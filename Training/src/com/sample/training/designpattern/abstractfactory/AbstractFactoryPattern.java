package com.sample.training.designpattern.abstractfactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		Application windowsApp = new Application(new AppFactory()) ;
		windowsApp.createApp();
		
		Application macApp = new Application(new MacFactory()) ;
		macApp.createApp();
		
		
	}

}
