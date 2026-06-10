package Lambda_Streams.LambdaExpression;

public class LambdaEx1 {

	
	interface Addition {
		int add(int a, int b);
	}
	
	
	public static void main(String[] arg) {
		
		Addition sum = (a, b)-> a+b;
		
		System.out.println("Lambda value::::  "+sum.add(10,20));
		
	}
	
	
}
