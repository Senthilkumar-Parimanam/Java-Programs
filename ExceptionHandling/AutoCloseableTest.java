package ExceptionHandling;

public class AutoCloseableTest implements AutoCloseable{
	
	
	@Override
	public void close(){
		System.out.println("Closed operation is done");
	}
	
	
	public static void main(String arg[]){
		
		
		try(AutoCloseableTest ob = new AutoCloseableTest()){
			System.out.println("Closing operation will start");
		}
		catch(Exception e){
			System.out.println("No Exception");
		}
		
		System.out.println("Program completed");
	}
	


}
