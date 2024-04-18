package com.sample.training.threads;

public  class SharedResource {
	
	int count = 0;
	private static SharedResource sr;    
    private SharedResource() {
    	
    }   
    
    public static SharedResource getInstance() {
        
        if (sr == null) {
            sr = new SharedResource();
        }
        return sr;
    }
    
	public synchronized void addItem() {
		count++;
		System.out.println("Added Item: "+count);
		notifyAll();
	}
	
	public synchronized void consumeItem() throws InterruptedException {	
		while (getCount() <= 0) {
			wait();
		}
		count--;		
		System.out.println("Consumed Item: "+count);
	}

	public int getCount() {
		return count;
	}
	
	

}
