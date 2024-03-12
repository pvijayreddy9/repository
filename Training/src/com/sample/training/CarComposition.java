package com.sample.training;

public class CarComposition {

	 private String model;
	    private EngineComposition engine; // Composition

	    public CarComposition(String model, String engineType) {
	        this.model = model;
	        this.engine = new EngineComposition(engineType); // Composition
	    }

	    public String getModel() {
	        return model;
	    }

	    public EngineComposition getEngine() {
	        return engine;
	    }
}
