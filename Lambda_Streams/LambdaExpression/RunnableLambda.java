package Lambda_Streams.LambdaExpression;

public class RunnableLambda {
	
	
	public static void main(String[] arg) {
		System.out.println(" This is main Thread :: "+ Thread.currentThread().getName());
		Runnable runnableOb = ()->  System.out.println(" This a new Thread by Lambda  "+ Thread.currentThread().getName());
		Thread thread = new Thread(runnableOb);
		thread.start();
	}
	

}
