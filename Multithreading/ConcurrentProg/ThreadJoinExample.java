package Multithreading.ConcurrentProg;

class MyRunnable implements Runnable{
	 
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"is running now ::");
            System.out.println(Thread.currentThread().getName()+" is in "+Thread.currentThread().getState());
            Thread.sleep(400);
            System.out.println(Thread.currentThread().getName()+"is back now ::");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"Thread ended:::");
    }
     
}


public class ThreadJoinExample {
	 
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        System.out.println("Main Thread State :: "+Thread.currentThread().getState());
        System.out.println(" Thread T1 will be started by main thread. now t1 State :: "+t1.getState());
        t1.start();
        System.out.println("Thread T1 State :: "+t1.getState()); 
        try {
        	System.out.println(Thread.currentThread()+" is calling join of T1 Thread :::");
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread T2 will be started by Main Thread. now t2 State :: "+t2.getState());
        t2.start();
        System.out.println("Thread T2 State :: "+t2.getState());
        try {
        	System.out.println("Calling join of T2 Thread :::");
        	t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
             
    	System.out.println("Thread T1 State :: "+t1.getState());
    	System.out.println("Thread T2 State :: "+t2.getState());
    	System.out.println("All threads are dead, exiting main thread");
    }
 
}
 
