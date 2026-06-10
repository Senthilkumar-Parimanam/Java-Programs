package Multithreading.AsynchronousProg.CompletFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ComFutureRunAync implements Runnable{
	
	
	public void run() {
		
		System.out.println("runAsyncExample::");
		System.out.println("Thread.currentThread().getName() :: " + Thread.currentThread().getName());
		System.out.println("isDaemon:: "+Thread.currentThread().isDaemon());
	}
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("main::");
		Runnable runnable = new ComFutureRunAync();
		System.out.println("runAsyncExample::");
		CompletableFuture<Void> cf = CompletableFuture.runAsync(runnable);
		cf.get();
		
		
	}
	
}
