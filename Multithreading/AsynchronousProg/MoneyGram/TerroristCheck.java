package Multithreading.AsynchronousProg.MoneyGram;

public class TerroristCheck implements Runnable{
	
	ComplainceResult result;
	

	public TerroristCheck(ComplainceResult result) {
		this.result = result;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" TerroristCheck ::  "+ Thread.currentThread().getName());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" TerroristCheck Result Before Process :: "+ result.getValue() );
		result.setValue(result.getValue()*0);
		System.out.println(" TerroristCheck Result After Process :: "+ result.getValue());
		
	}
}
