package Multithreading.AsynchronousProg.CompletFuture;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<String> {

	
	 @Override
	    public String call() throws Exception {
		 System.out.println("main thread: "+Thread.currentThread().getName());
	        Thread.sleep(1000);
	        //return the thread name executing this callable task
	        return Thread.currentThread().getName();
	    }
	    
	    public static void main(String args[]){
	        //Get ExecutorService from Executors utility class, thread pool size is 5
	        ExecutorService executor = Executors.newFixedThreadPool(5);
	        //create a list to hold the Future object associated with Callable
	        List<Future<String>> list = new ArrayList<Future<String>>();
	        //Create MyCallable instance
	        Callable<String> callable = new CallableTest();
	        System.out.println("main thread: "+Thread.currentThread().getName());
	        System.out.println("main thread: "+Thread.currentThread().getState());
	        for(int i=0; i< 5; i++){
	            //submit Callable tasks to be executed by thread pool
	            Future<String> future = executor.submit(callable);
	            //add Future to the list, we can get return value using Future
	            list.add(future);
	        }
	        System.out.println(" // Before calling Future.get()-> Annonym Class Thread1 ");
	        Thread testThread1 = new Thread(){
	        	public void run(){
	        		System.out.println("Annonym Class Thread1 is exeucting ");
	        	}
	        };
	        testThread1.start();
	        for(Future<String> fut : list){
	            try {
	                //print the return value of Future, notice the output delay in console
	                // because Future.get() waits for task to get completed
	            	//System.out.println("main thread: "+Thread.currentThread().getState());
	                System.out.println(new Date()+ "::"+fut.get());
	            } catch (Exception e) {
	                ((Throwable) e).printStackTrace();
	            }
	        }
	       
	        System.out.println(" Before Executor shutdown -> Annonym Class Thread2 ");
	        Thread testThread2 = new Thread(){
	        	public void run(){
	        		System.out.println("Annonym Class Thread2 is exeucting ");
	        	}
	        };
	        testThread2.start();
	        //shut down the executor service now
	        executor.shutdown();
	        
	        System.out.println(" After Executor shutdown -> Annonym Class Thread3 ");
	        Thread testThread3 = new Thread(){
	        	public void run(){
	        		System.out.println(" Annonym Class Thread3 is exeucting ");
	        	}
	        };
	        testThread3.start();
	        
	        System.out.println("main thread is completed");
	    }
 

}


