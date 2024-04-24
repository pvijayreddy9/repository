package com.sample.training.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class LockFreeConcurrency {
	
	    private AtomicInteger counter = new AtomicInteger(0);

	    public void increment() {
	       
	        counter.incrementAndGet();
	        System.out.println(counter);
	    }

	    public int getCounter() {
	        
	        return counter.get();
	    }

	    public static void main(String[] args) {
	    	LockFreeConcurrency lfc = new LockFreeConcurrency();
	        
	        for (int i = 0; i < 10; i++) {
	            Thread thread1 = new Thread(() -> {
	                for (int j = 0; j < 200; j++) {
	                	
	                	lfc.increment();
	                }
	            });
	            thread1.start();
	            Thread thread2 = new Thread(() -> {
	            	for (int j = 0; j < 200; j++) {
	            		
	            		lfc.increment();
	            	}
	            });
	            thread2.start();
	        }
	        
	        System.out.println("Counter value: " + lfc.getCounter()); 
	    }
	


}
