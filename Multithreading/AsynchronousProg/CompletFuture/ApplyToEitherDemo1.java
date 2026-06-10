package Multithreading.AsynchronousProg.CompletFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class ApplyToEitherDemo1 {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
	  CompletableFuture<Person> primaryFuture = CompletableFuture.completedFuture(new Person("Mohan", "Varanasi"));
	  
	  CompletableFuture<Person> secondaryFuture = CompletableFuture.completedFuture(new Person("Shyam", "Prayagraj"));
	  
	  CompletableFuture<String> future =
	      primaryFuture.applyToEither(secondaryFuture, person -> person.getName() + " - " +person.getCity());
	  
	  System.out.println(future.get());
	  completedFutureExample();
  }


static void completedFutureExample() {
	  System.out.println("completedFutureExample:"  );
    CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
   System.out.println("isDone() :" + cf.isDone() );
   try {
	System.out.println("message() :" + cf.get());
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ExecutionException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
}

} 



class Person{
	
	String name;
	String city;
	
	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}