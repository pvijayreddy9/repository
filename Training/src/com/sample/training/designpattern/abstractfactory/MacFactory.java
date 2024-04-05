package com.sample.training.designpattern.abstractfactory;

public class MacFactory implements PlayStoreFactory {

	@Override
	public App createApp() {
		
		return new MacApp();
	}

	@Override
	public Button createButton() {
		
		return new MacButton();
	}

}
