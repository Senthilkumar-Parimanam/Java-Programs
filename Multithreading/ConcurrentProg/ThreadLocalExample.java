package Multithreading.ConcurrentProg;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalExample implements Runnable {

	   // Atomic integer containing the next thread ID to be assigned
   private static final AtomicInteger number = new AtomicInteger(0); 
    
   // Thread local variable containing each thread's ID
   private static final ThreadLocal<String> threadId = new ThreadLocal<String>();
   
 
   public int defineThreadLocalId(){
	   System.out.println(" Defining thread Local variable ");
	   int threadLocalNumber =  number.incrementAndGet();
	   System.out.println(" Atomic lNumber  = "+ threadLocalNumber);
	   threadId.set(number.toString());
	   return threadLocalNumber;
   }
   
     
   @Override
   public void run()
   {
	   
	   defineThreadLocalId();
      System.out.println(" Thread Local Value for this thread is : ");
      System.out.println(Thread.currentThread().getName() +" "+ threadId.get());
   }
   
   
  public static void main(String arg[]){
	  
	  Runnable runOb1 = new ThreadLocalExample();
	  Thread t1 = new Thread(runOb1);
	  Thread t2 = new Thread(runOb1);
	  Runnable runOb2 = new ThreadLocalExample();
	  Thread t3 = new Thread(runOb2);
	  t1.start();
	  t2.start();
	  t3.start();
	  
  }
   
   
}