package com.sample.training.threads;

public class PriorityThreadExample {
    public static void main(String[] args) {
        
        Thread thread1 = new MyThread("Thread 1", Thread.MIN_PRIORITY);
        Thread thread2 = new MyThread("Thread 2", Thread.MAX_PRIORITY);
        
        thread1.start();
        thread2.start();
    }
}



