package Multithreading.AsynchronousProg.MoneyGram;

public class WatchListCheck implements Runnable {
	
	ComplainceResult result;
	

	public WatchListCheck(ComplainceResult result) {
		this.result = result;
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" WatchListCheck ::  "+ Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" WatchList Result Before Process :: "+ result.getValue() );
		result.setValue(result.getValue()*2);
		System.out.println(" WatchList Result After Process :: "+ result.getValue());
		
	}
	
}
