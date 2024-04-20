package com.sample.training.threads;

public class MyThread extends Thread {
    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority); 
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " with priority " + getPriority());
       
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + getName() + ": " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread " + getName() + " finished");
    }
}
