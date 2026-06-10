package Lambda_Streams.LambdaExpression;

public class SampleProgam {

	@FunctionalInterface
	interface functionalInterface {
		public String abstractMethod(String arg);
		public default void defaultMethod(){
			
		}
		public static void staticMethod(){
			
		}
	
		
	}

	public static void main(String[] args) {

		System.out.println(" Lambda Expression");
		String lambdaArg = " Lambda ";
		functionalInterface funInt = (String lamArg) -> {
			System.out.println("Lambda Argument value: "+ lamArg);
			return lamArg;
		};
	
		String lamReturn = funInt.abstractMethod(lambdaArg);
		System.out.println("Lambda return value is "+lamReturn);
	}

}
