package Multithreading.ConcurrentProg;

public class StopThread implements Runnable {

	public void run() {
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+ " "+ i+" times ");
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String arg[]){
		StopThread ob = new StopThread();
		Thread t= new Thread(ob);
		t.start();
		t.interrupt();
		System.out.println("  Finished ");
	}
}
