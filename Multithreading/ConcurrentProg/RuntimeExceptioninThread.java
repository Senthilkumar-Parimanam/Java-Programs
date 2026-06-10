package Multithreading.ConcurrentProg;

import java.lang.Thread.UncaughtExceptionHandler;

public class RuntimeExceptioninThread implements Runnable{
	
	@Override
	public void run(){
		System.out.println("throwing runtime exception from thread");
		throw new RuntimeException();
	}
	

	public static void main(String[] arg){
		
		Runnable ob  = new RuntimeExceptioninThread();
		Thread t = new Thread(ob);
		UncaughtExceptionHandler handler = new UncaughtExceptionHandImpl(); 
		t.setUncaughtExceptionHandler(handler);
		t.start();
		
	}
	
}


class UncaughtExceptionHandImpl implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("UnCaught Exception Handler ");
		
	}
	
}