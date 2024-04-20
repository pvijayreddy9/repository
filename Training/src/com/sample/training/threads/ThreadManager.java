package com.sample.training.threads;

public class ThreadManager {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();		
		Thread2 t2 = new Thread2();		
		Thread t2 = new Thread2();		
		Thread t2 = new Thread2();		
		
		t1.start();		
		t1.join();		
		t2.start();		
        t2.interrupt();
		
	}

}
