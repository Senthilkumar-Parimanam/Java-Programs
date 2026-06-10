package Lambda_Streams.LambdaExpression;

import java.util.function.BiFunction;

public class MethodRefEx {

	interface FunctionalInterface{
		void display();
	}
	
	public void displayObject() {
		System.out.println(" This is a Instance Method displayObject :::");
		System.out.println(" display() has same signature as  FunctionalInterface display() :::");
		System.out.println(" But displayObject() is a Instance method ::");
		System.out.println(" this method can be assigned as a Instance Method Ref to FunctionalInterface");
		System.out.println(" displayObject() will be triggered, when methodRef.display() is called ;  ");
		
	}
	
	public static void displayStatic() {
		System.out.println(" This is a Static Method for DisplayRef :::");
		System.out.println(" displayRef() has same signature as StaticInt Interface display() :::");
		System.out.println(" But displayStatic() is a static method ::");
		System.out.println(" this method can be assigned as a Static Method Ref to FunctionalInterface");
		System.out.println(" displayStatic() will be triggered, when methodRef.display() is called ; ");
	}

	public static void threadRun() {
		System.out.println(" threadRun() has same signature as Runnable Interface run() :::");
		System.out.println(" But threadRun() is a static method ::");
		System.out.println(" So this method can be assigned as a Static Method Ref to Runnable Interface");
		System.out.println(" or passed to Thread(Runnable Ob).. when we call Thread.start ");
		System.out.println(" threadRun() is called ");
		System.out.println(" new Thread name is ::  "+ Thread.currentThread().getName());
		
	}
	
	public static int add(int a, int b){  
		System.out.println(" addition of a and b ");
		return a+b;  
	}  
	
	
	public static void main(String[] arg) {
		System.out.println(" Example for Static Method Ref  :::");
		FunctionalInterface methodRef = MethodRefEx::displayStatic;
		//methodRef.display();
		
		Thread thread = new Thread(MethodRefEx::threadRun);
		//thread.start();
		
		BiFunction<Integer, Integer, Integer> adder = MethodRefEx::add; 
		//int result = adder.apply(10, 20);  
		//System.out.println(" Result is   ::: "+ result);
		
		MethodRefEx object = new MethodRefEx();
		FunctionalInterface objMethodRef = object::displayObject;
		objMethodRef.display();
		
		
		
		
		
	}
	
	
}
