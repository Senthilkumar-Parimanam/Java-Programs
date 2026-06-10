package Multithreading.ConcurrentProg;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest implements Runnable {
	
	private String sharedMsg = "Shared Object";
	private ReentrantLock lock = new ReentrantLock(true);
		
	
	@Override
	public void run() {

		
		
	}


}
