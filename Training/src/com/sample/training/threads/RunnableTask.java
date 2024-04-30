package com.sample.training.threads;

public class RunnableTask implements Runnable{

	private final String taskName;

    public RunnableTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Executing " + taskName + " on thread: " + Thread.currentThread().getName());
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " completed.");
    }

}
