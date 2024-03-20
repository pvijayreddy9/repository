package com.sample.training;

public class CarOverriding extends EngineAggregation {

	public CarOverriding(String type) {
		super(type);
		
	}
	@Override
	public String getType() {
		System.out.println("this method is overrided");
        return "V90";
    }
	
	@Override
	public void engineSpecs(String specs) {
    	System.out.println("new specs added"+specs);
    	
    }
	
	

}
