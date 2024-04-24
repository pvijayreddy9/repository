package com.sample.training.threads;

import java.util.concurrent.CopyOnWriteArrayList;

public class NormalIncrement {
	int counter =0;
	public void increment() {        
       counter++;
       System.out.println(counter);
		
    }

	public static void main(String[] args) {
		NormalIncrement n = new NormalIncrement();
		Thread t1 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
            	System.out.println("t1 thread start");
				n.increment();			
			}
        });
		t1.start();
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 200; i++) {
				System.out.println("t2 thread start");
				n.increment();
			}
		});
		t2.start();
		

	}

}
