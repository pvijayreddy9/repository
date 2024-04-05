package com.sample.training.designpattern.abstractfactory;

public class AppFactory implements PlayStoreFactory {

	@Override
	public App createApp() {
		
		return new WindowsApp();
	}

	@Override
	public Button createButton() {
		
		return new WindowsButton();
	}

}
