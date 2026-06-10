package Multithreading.ConcurrentProg;

public class ThreadSleep implements Runnable{
	
	@Override
	public void run(){
		System.out.println(" Current Thread "+Thread.currentThread().getName());
		for(int i=1 ;i<=5;i++){
			 System.out.println(Thread.currentThread().getName()+"  " + i); 
		 }

		/*try {
			System.out.println(Thread.currentThread().getName()+" is going to sleep ");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+" Wakeup ");
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+" Interrupt exception ");
		}*/
		
	}


 public static void main(String arg[]){
	 
	 ThreadSleep ob = new ThreadSleep();
	 Thread t = new Thread(ob);
	 t.start();
	 try {
		 System.out.println(" Current Thread "+Thread.currentThread().getName());
		 //System.out.println(Thread.currentThread().getName()+" is going to sleep ");
		 t.sleep(1000);
		 for(int i=1 ;i<=5;i++){
			 System.out.println(" main  "+ i); 
		 }
		 //Thread.sleep(1000);
		 //System.out.println(Thread.currentThread().getName()+" Wakeup ");
	 } catch(InterruptedException e){
		 System.out.println(Thread.currentThread().getName()+" Interrupt exception ");
	 }
	 

	 
 }

}
