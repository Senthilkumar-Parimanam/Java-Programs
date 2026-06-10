package Multithreading.ConcurrentProg;

public class ThreadInterrupt implements Runnable {

	public void run() {
		try {
			System.out.println("Thread Name : "+ Thread.currentThread().getName());
			System.out.println("Status : "+ Thread.currentThread().getState());
			Thread.sleep(10000);
			System.out.println("Wakeup:  "+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			System.out.println("Thread is interrupted in run()..." + e);
			System.out.println("Status : "+ Thread.currentThread().getState());
		}
		System.out.println("Status : "+ Thread.currentThread().getState());
		System.out.println("Afer Interrupt and Sleep:  ");

	}

public static void main(String args[]){  
	ThreadInterrupt ob=new ThreadInterrupt();  
	Thread t = new Thread(ob);
	t.start();  
	System.out.println("Before Thread interruption in main ");
	t.interrupt();  
	System.out.println("After Thread interruption in main ");
 }

}