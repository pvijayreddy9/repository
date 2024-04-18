package com.sample.training.threads;

public class NormalThread extends Thread {

	

	@Override
	public void run() {
//		while (!Thread.interrupted()) {
//            System.out.println("NormalThread is running.");
//        }
//        System.out.println("Normal Thread interrupted.");
		SharedResource sr = SharedResource.getInstance();
		 for (int i = 0; i < 100; i++) {
			 sr.addItem();
         }
		
	}
}
