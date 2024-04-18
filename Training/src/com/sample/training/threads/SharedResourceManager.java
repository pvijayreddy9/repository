package com.sample.training.threads;

public class SharedResourceManager {

	public static void main(String[] args) throws InterruptedException {
		RunnableThread rt = new RunnableThread();
		Thread t1 = new Thread(rt);
		NormalThread nt = new NormalThread();
				
		nt.start();
		t1.start();
		
		

	}

}
