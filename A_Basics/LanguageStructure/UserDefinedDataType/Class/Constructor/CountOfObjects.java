package A_Basics.LanguageStructure.UserDefinedDataType.Class.Constructor;

public class CountOfObjects {

	public static void main(String arg[]){
	
		A oba = new A();
		B obb = new B();
		C obc = new C();
		
		B obb1 = new B();
		C obc1 = new C();
		
		C obc2 = new C();
		
		oba.countOb();
		obb.countOb();
		obc.countOb();
	}
	
}


class A{ 
	
	static int count =0;
	
	A(){
		++count;
		
	}
	
	A(String dummy){
		
	}
	
	public void countOb(){
		System.out.println("no of objects A:: "+ count);
	}
}

class B extends A{
	static int count =0;
	B(){
		this("No default constructor of super");
		++count;
	}
	
	B(String dummy){
		super(dummy);
	}
	
	public void countOb(){
		System.out.println("no of objects B:: "+ count);
	}
}

class C extends B{ 
	
	static int count =0;
	
	C(){
		this("No default constructor of super");
		++count;
	}
	
	C(String dummy){
		super(dummy);
	}
	
	public void countOb(){
		System.out.println("no of objects C::"+ count);
	}
}