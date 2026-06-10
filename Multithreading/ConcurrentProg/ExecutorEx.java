package Multithreading.ConcurrentProg;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class ExecutorEx implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}
	

	public static void main(String[] arg) {
		
		ExecutorEx example = new ExecutorEx();

	}
	
}
