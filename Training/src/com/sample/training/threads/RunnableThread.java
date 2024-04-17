package com.sample.training.threads;

public class RunnableThread implements Runnable {
	
	
	@Override
	public void run() {
		System.out.println("This is RunnableThread");
		SharedResource sr = new SharedResource();
		for (int i = 0; i < 100; i++) {
			sr.consumeItem();
		}
	}

}
