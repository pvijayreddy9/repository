package com.sample.training.designpattern.abstractfactory;

public class Application {
	 private final PlayStoreFactory factory;

	    public Application(PlayStoreFactory factory) {
	        this.factory = factory;
	    }

	    public void createApp() {
	        App window = factory.createApp();
	        Button button = factory.createButton();

	        window.install("App installed");
	        button.click();
	    }
}
