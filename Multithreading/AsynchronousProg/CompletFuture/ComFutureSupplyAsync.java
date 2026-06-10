package Multithreading.AsynchronousProg.CompletFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;

public class ComFutureSupplyAsync {

	/**
	 * A supplier that sleeps for a second, and then returns one
	 **/
	public static class MySupplier implements Supplier<Integer> {
		int instanceMem = 10;

		@Override
		public Integer get() {
				System.out.println("MySupplier : "); 
				System.out.println("  MySupplier thread:::  " + Thread.currentThread().getName());
				System.out.println("  isDaemon:: " + Thread.currentThread().isDaemon());
				instanceMem = instanceMem + 10;
				System.out.println("  instance Member : " + instanceMem);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("  MySupplier is completed:: " );
				return instanceMem;
		}
	}

	/**
	 * A (pure) function that adds one to a given Integer
	 **/
	public static class Plus implements Function<Integer, Integer> {
		// if a Thread (Pool-1-thread-1) of MySupplier is completed before calling the PlusOne task in main method
		//CompletableFuture<Integer> compFuture2 = compFuture1.thenApply(new PlusOne());
		// then main thread has to run the compFuture1.thenApply(new PlusOne()) task
		// Otherwise (Pool-1-thread-1) will execute the compFuture1.thenApply(new PlusOne())
		@Override
		public Integer apply(Integer x) {
			System.out.println("Plus Operation : "); // False
			System.out.println("  Plus thread ::: "+ Thread.currentThread().getName());
			System.out.println("  isDaemon:: " + Thread.currentThread().isDaemon());
			System.out.println("  X value passed to Plus   :: " + x);
			System.out.println("  Result :: " + (x+100));
			return x + 100;
		}
	}
	
	public static class Multiply implements Function<Integer, Integer> {
		@Override
		public Integer apply(Integer x) {
			System.out.println("Multiply Operation : "); // False
			System.out.println("  Multiply thread ::: "+ Thread.currentThread().getName());
			System.out.println("  isDaemon:: " + Thread.currentThread().isDaemon());
			System.out.println("  X value passed to Multiply  :: " + x);
			System.out.println("  Result :: " + (x * 100));
			return x * 10;
		}
	}
	
	

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newFixedThreadPool(4);
		System.out.println("  main thread  :::: "+ Thread.currentThread().getName() ); 
		
		CompletableFuture<Integer> compFuture1 = CompletableFuture.supplyAsync(new MySupplier(), exec);
		System.out.println("  MySupplier.isDone() : " + compFuture1.isDone()); 
		
		CompletableFuture<Integer> compFuture2 = compFuture1.thenApply(new Plus());
		System.out.println("  Pluse.isDone() : " + compFuture2.isDone()); 
		
		CompletableFuture<Integer> compFuture3 = compFuture2.thenApplyAsync(new Multiply());
		System.out.println("  Multiply.isDone() : " + compFuture2.isDone()); 
		
		System.out.println("exec.isShutdown() : " + exec.isShutdown() ); 
		//System.out.println("Calling get() of Multiply from main thread :: "+compFuture3.get() ); 
		
		//exec.shutdown();
		System.out.println("exec.isShutdown() : " + exec.isShutdown() ); 
		System.out.println("--- Main thread is end ---- "); // False
	}

}
