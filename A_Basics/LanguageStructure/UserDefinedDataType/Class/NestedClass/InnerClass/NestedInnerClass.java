package A_Basics.LanguageStructure.UserDefinedDataType.Class.NestedClass.InnerClass;

public class NestedInnerClass {

	private String instanceSt = "Instance String";
	private static String staticSt = "Static String";
	
	public static void outerStaticMethod(){
		System.out.println("Outer Class static method :");
	}
	
	public void outerInstanceMethod(){
		System.out.println("Outer Class instance method :");
	}
	
	
	public void getInner(){
		
		InnerClass ic = new InnerClass();
		ic.get();
	}
	
	public class InnerClass{
		
		/*// Static data field should not be created
		private static int a =10;
		//Static method should not be created
		public static void getstatic(){}
				*/
		
		public void get(){
			// outer class instance method can be used inside
			outerInstanceMethod();
			// outer class instance field or data can be used inside
			System.out.println("Outer Class instance var :"+ instanceSt);
			System.out.println("Outer Class static var :"+ staticSt);
		}
		
		
	}
	
	
	
	public static void main(String arg[]){
		
	 NestedInnerClass Nic = new NestedInnerClass();
	 Nic.getInner();
	}

}
