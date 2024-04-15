package com.sample.training.threads;

public class ThreadManager {

	public static void main(String[] args) {
		RunnableThread runnable = new RunnableThread();
		NormalThread thread = new NormalThread();
		
		runnable.run();
		thread.run();
		thread.start();
	}

}
