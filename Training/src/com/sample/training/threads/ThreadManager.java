package com.sample.training.threads;

public class ThreadManager {

	public static void main(String[] args) throws InterruptedException {
		RunnableThread runnable = new RunnableThread();
		Thread t1 = new Thread(runnable);
		NormalThread thread = new NormalThread();		
		
		t1.start();	
		t1.sleep(5000);
		t1.join();
		thread.start();
		thread.wait(2000);
		thread.join();
	}

}
