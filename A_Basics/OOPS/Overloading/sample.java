package A_Basics.OOPS.Overloading;

public class sample {

	static int a =10;
	public static void main(String arg[]){
		
		  System.out.println("hai"+a);
	}
	
	static {
		  System.out.println("static "+a);
		 a = 20;
		  System.out.println("static "+a);
		
	}
	
	public static void run(){
		  System.out.println("hai1");
	}
}
