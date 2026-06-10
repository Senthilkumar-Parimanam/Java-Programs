package A_Basics.OOPS.Overloading;



public class example {
	
	public void methodSt(long ob){
		System.out.println("long");
	}
	
	public void methodSt(int num){
		System.out.println("int");
	}
	

	
	public void methodSt(double ob){
		System.out.println("double");
	}

	public static void main(String arg[]){
		example ob = new example();
		ob.methodSt(4);
		ob.methodSt(1111111111);
		ob.methodSt(4.2);
	}
}
