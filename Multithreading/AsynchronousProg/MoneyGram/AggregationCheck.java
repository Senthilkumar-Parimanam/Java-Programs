package Multithreading.AsynchronousProg.MoneyGram;

public class AggregationCheck implements Runnable{

	ComplainceResult result;
	

	public AggregationCheck(ComplainceResult result) {
		this.result = result;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" AggregationCheck ::  "+ Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" AggregationCheck Result Before Process :: "+ result.getValue() );
		result.setValue(result.getValue()*2);
		System.out.println(" AggregationCheck Result After Process :: "+ result.getValue());
		
	}

}
