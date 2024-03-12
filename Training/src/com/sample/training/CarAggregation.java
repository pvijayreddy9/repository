package com.sample.training;

public class CarAggregation {
	private String model;
    private EngineAggregation engine; // Aggregation

    public CarAggregation(String model, EngineAggregation engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public EngineAggregation getEngine() {
        return engine;
    }


}
