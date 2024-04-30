package com.sample.training.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTaskExample {
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();		
		for (int i = 1; i <= 5; i++) {
	        RunnableTask task = new RunnableTask("Task " + i);
	        executor.execute(task);
	    }	    
	    executor.shutdown();
	}
	
	
}
