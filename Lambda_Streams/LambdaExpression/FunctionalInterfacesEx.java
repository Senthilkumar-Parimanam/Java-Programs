package Lambda_Streams.LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesEx {

	
	public static void main(String[] args) {
		
		Consumer<String> consumer = (consumerVar)-> System.out.println("Consumer :: "+ consumerVar);
		consumer.accept(" accept() ");
	
		Predicate<String> predicate = (booleanVar)-> { System.out.println(" Predicate :: "+booleanVar); return true;};
		System.out.println(" Predicate Lambda :: "+ predicate.test("test"));
		predicate.test("test ()");
		
		Supplier<String> supplier = ()-> {System.out.println(" Supplier Interface ::  ");return "supplier "; };
		String result = supplier.get();
		
	}
	
}
