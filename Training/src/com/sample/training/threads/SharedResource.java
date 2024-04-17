package com.sample.training.threads;

public  class SharedResource {
	int count = 0;
	public synchronized void addItem() {
		count++;
		System.out.println("Added Item: "+count);
	}
	
	public synchronized void consumeItem() {
		count--;
		System.out.println("Consumed Item: "+count);
	}

	public int getCount() {
		return count;
	}
	
	

}
