package Multithreading.AsynchronousProg.CompletFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuture2 {
	
	
	public static void main(String[] arg) throws InterruptedException, ExecutionException {
		  System.out.println("main thread :: "+ Thread.currentThread().getName());
		
		CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
		    @Override
		    public void run() {
		        // Simulate a long-running Job
		        try {
		            TimeUnit.SECONDS.sleep(1);
		        } catch (InterruptedException e) {
		            throw new IllegalStateException(e);
		        }
		        System.out.println("I'll run in a separate thread than the main thread.");
		        System.out.println(" thread name :: "+ Thread.currentThread().getName());
		        System.out.println(" Dameon thread :: "+ Thread.currentThread().isDaemon());
		    }
		});

		// Block and wait for the future to complete
		future.get();
	}

}
