package com.sample.training.threads;

public class ThreadManager {

	public static void main(String[] args) {
		RunnableThread runnable = new RunnableThread();
		Thread t1 = new Thread(runnable);
		NormalThread thread = new NormalThread();
		
		t1.run();
		t1.start();
		thread.run();
		thread.start();
	}

}
