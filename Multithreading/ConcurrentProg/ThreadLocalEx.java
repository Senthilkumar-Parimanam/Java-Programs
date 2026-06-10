package Multithreading.ConcurrentProg;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalEx implements Runnable {

	// Atomic integer containing the next thread ID to be assigned
	private static final AtomicInteger nextId = new AtomicInteger(0);

	// Thread local variable containing each thread's ID
	private static final ThreadLocal<Integer> threadId =
	    new ThreadLocal<Integer>() {
	        @Override protected Integer initialValue() {
	            return nextId.getAndIncrement();
	    }
	};

	// Returns the current thread's unique ID, assigning it if necessary
	public static int get() {
	    return threadId.get();
	}
	
	@Override
	public void run(){
		
	
	System.out.println(Thread.currentThread().getName()+" " + get());
	}


	public static void main(String arg[]){
		
		Runnable runOb1 = new ThreadLocalEx();
		Thread t1 = new Thread(runOb1);
		Runnable runOb2 = new ThreadLocalEx();
		Thread t2 = new Thread(runOb2);
		t1.start();
		t2.start();
		
	}
	

}
