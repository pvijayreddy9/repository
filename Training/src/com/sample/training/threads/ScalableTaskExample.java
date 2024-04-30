package com.sample.training.threads;

import java.util.concurrent.*;

public class ScalableTaskExample {

    public static void main(String[] args) {        
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 10; i++) {  
        	int m = 1+i;
        	int n = 2+i;
            Callable<Integer> task = () -> add(m,n);
            Future<Integer> future = executor.submit(task);            
           
            try {
				System.out.println("Addition of numbers: "+ future.get());
			} catch (InterruptedException | ExecutionException e) {
				
				e.printStackTrace();
			}
            
        }
        
        executor.shutdown();
    }
    
    private static int add(int n,int m) {       
        
        return (n+m);
    }
}

