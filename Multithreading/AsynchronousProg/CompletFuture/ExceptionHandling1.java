package Multithreading.AsynchronousProg.CompletFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class ExceptionHandling1 {

	
	
	public static void main(String[] arg) throws InterruptedException, ExecutionException {
		
		
		Supplier<String> supplier = ()-> {System.out.println(" Supplier Interface ::  ");return "0"; };
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(supplier);
		
		
		CompletableFuture<String> future2 = future1.thenApply(Integer::parseInt) // input String: "Example"
		        .thenApply(r -> r / 0)
		        .thenApply(s -> "apply>> " + s)
		        .exceptionally(ex -> " The Error is   ::" + ex.getMessage());
		
		System.out.println("Result : "+ future2.get());
	}
	

}
