package Lambda_Streams.LambdaExpression;

public class LambdaAsArgument {
	
	interface Greeting{
		void greetingDispaly();
	}
	
	public void greetingDel(Greeting greeting) {
		greeting.greetingDispaly();
	}
	
	
	public static void main(String[] arg) {
		
		Greeting lambda = ()-> System.out.println(" This is Lambda variable");
		LambdaAsArgument ob = new LambdaAsArgument();
		ob.greetingDel(lambda);
		ob.greetingDel(()-> System.out.println(" Inline Lambda "));
		
	}
	
	
}
