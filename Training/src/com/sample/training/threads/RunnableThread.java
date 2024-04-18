package com.sample.training.threads;

public class RunnableThread implements Runnable {
	
	
	@Override
	public void run() {
		System.out.println("This is RunnableThread");
		SharedResource sr = SharedResource.getInstance();		
		try {
			for (int i = 0; i < 100; i++) {
				sr.consumeItem();
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
