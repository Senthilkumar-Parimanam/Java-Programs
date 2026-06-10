package Multithreading.ConcurrentProg;

public class ThreadJoinTest implements Runnable{
	
	@Override
	public void run(){
		 System.out.println("Thread started:::"+Thread.currentThread().getName());
	        try {
	            System.out.println(Thread.currentThread().getName()+" is running now ::");
	            System.out.println(Thread.currentThread().getName()+" is in "+Thread.currentThread().getState());
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println(Thread.currentThread().getName()+"  Thread ended:::");
	    }
	
	
	public void myJoin(Thread thread){
		synchronized(thread){
			
			while (thread.isAlive()) {
	              try {
	            	  System.out.println("user thread : true - is alive, false - dead => "+ thread.isAlive());
	            	  System.out.println( Thread.currentThread().getName()+"  Thread will go to wait state");
					  thread.wait(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          }
			  System.out.println("user thread : true - is alive, false - dead => "+ thread.isAlive());
			System.out.println(Thread.currentThread().getName()+"  Thread Comes out of waiting state and spin lock");
			
		}
			
		
	}
		
	public static void main(String arg[]){
		ThreadJoinTest joinTest = new ThreadJoinTest();
		Thread thread = new Thread(joinTest);
		thread.start();
		joinTest.myJoin(thread);
        System.out.println("now main thread completes");

		
	}
	
	

}
