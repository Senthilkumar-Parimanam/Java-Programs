package A_Basics.LanguageStructure.UserDefinedDataType.Class.NestedClass.StaticClass;

interface interfaceEx {
	void testInterface();
}

class classEx {
	public int a;
	
}

public class StaticClass {
	
	private String instanceSt = "Instance Member";
	private static int a = 100; 
	
	public static void outerStaticMethod(){
		System.out.println("Outer Class static method :");
	}
	
	public void outerInstanceMethod(){
		System.out.println("Outer Class instance method :");
	}
	
	public static class NestedClass extends classEx implements interfaceEx {
	
		// Static field can be created
		private static int a =10;
		private int b = 10;

		@Override
		public void testInterface(){
			System.out.println(" testInterface ");
		}
		public void get(){
			//Static method of outer class can be used
			outerStaticMethod();
			//Static field of outer class can be used
			System.out.println(" a :"+ a);
			System.out.println("b  :"+ b);
		/*	// Instance member method of outer class should not be used
			outerInstanceMethod();
			
			// Instance member field of outer class should not be used
			System.out.println("Outer Class instance var :"+ instanceSt);*/
					
		}
		
		public static void getStatic(){
			
			System.out.println("Outer Class static var :"+ a);
			//System.out.println("Outer Class static var :"+ b);
			
		}
		
		
	}
	
	
	public static void main(String arg[]){
		
		NestedClass ob = new NestedClass();
		ob.get();
		ob.getStatic();
	}
	
	

}
