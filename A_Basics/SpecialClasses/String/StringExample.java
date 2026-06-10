package A_Basics.SpecialClasses.String;

public class StringExample {
	
	public static void main(String arg[]){
		String a = "hello world";
		String b = "hello world";
		if(a == b)
				System.out.println("a,b points same location");
		else
			System.out.println("a,b points different location");
		System.out.println(" a is "+ a);
		String c = "hello" + " world";
		if(c == b)
			System.out.println("c,b points same location");
		else
			System.out.println("c,b points different location");
		 c = c + " hai"; 
		 if(c == b)
				System.out.println("c,b points same location");
			else
				System.out.println("c,b points different location");
		
	}
}
