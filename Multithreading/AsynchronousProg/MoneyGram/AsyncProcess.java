package Multithreading.AsynchronousProg.MoneyGram;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncProcess {
	
	
	
	
	
	public static void main(String[] arg) {
		
		ExecutorService watchListPool = Executors.newFixedThreadPool(2);
		Executor terroristPool = Executors.newFixedThreadPool(2);
		Executor aggregationPool = Executors.newFixedThreadPool(2);
		
		ComplainceResult result = new ComplainceResult();
		WatchListCheck watchList = new WatchListCheck(result);
		TerroristCheck terrorist = new TerroristCheck(result);
		AggregationCheck aggregation = new AggregationCheck(result);
		System.out.println(" main thread is started ");
		watchListPool.execute(watchList);
		terroristPool.execute(terrorist);
		aggregationPool.execute(aggregation);
		while (true) {
			if(result.getValue() == 0 ) {
				System.out.println(" Process is completed : Result : "+ result.getValue());
				break;
			}
			if(result.getValue() == 2 ) {
				System.out.println(" One check is completed Positively : "+ result.getValue());
			}
			if(result.getValue() == 4 ) {
				System.out.println(" Two Checks are completed Positively : "+ result.getValue());
			}
			if(result.getValue() == 8 ) {
				System.out.println(" Three Checks are completed Positively : "+ result.getValue());
				break;
			}
		}
		System.out.println(" Main Thread is completed : ");	
		
		
	}
	

}
