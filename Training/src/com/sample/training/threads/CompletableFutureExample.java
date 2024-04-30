package com.sample.training.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {

    public static void main(String[] args) {
       
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
            return 42;
        }, executor);

        
        future.thenAccept(result -> {
            System.out.println("Result: " + result);
        });

        
        executor.shutdown();
    }
}

