package Lambda_Streams.LambdaExpression;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> biCon = (a,b)->{
			try {
				System.out.println(" Result : "+ a/b);
			}catch(Exception e) {
				System.out.println(" Exception is thrown : "+ e.getLocalizedMessage());
			}
		};
		
		biCon.accept(10,  0);
		System.out.println(" This is BiConsumer Functional Interface ::" );
		System.out.println("Exception Handling in Functional Interface ::" );
		
	}
	
}
