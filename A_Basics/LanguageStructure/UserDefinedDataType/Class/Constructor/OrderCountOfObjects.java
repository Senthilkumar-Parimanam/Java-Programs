package A_Basics.LanguageStructure.UserDefinedDataType.Class.Constructor;

public class OrderCountOfObjects {

	public static void main(String arg[]){
	
		A1 oba = new A1();
		B1 obb = new B1();
		C1 obc = new C1();
		
		B1 obb1 = new B1();
		C1 obc1 = new C1();
		
		C1 obc2 = new C1();
		
		oba.countOb();
		obb.countOb();
		obc.countOb();
	}
	
}


class A1{
	
	static int count =0;
	
	A1(){
		++count;
		
	}
	
	A1(String dummy){
		
	}
	
	public void countOb(){
		System.out.println("no of objects A:: "+ count);
	}
}

class B1 extends A1{
	static int count =0;
	B1(){
		this("No default constructor of super");
		++count;
	}
	
	B1(String dummy){
		super(dummy);
	}
	
	public void countOb(){
		System.out.println("no of objects B:: "+ count);
	}
}

class C1 extends B1{
	
	static int count =0;
	
	C1(){
		this("No default constructor of super");
		++count;
	}
	
	C1(String dummy){
		super(dummy);
	}
	
	public void countOb(){
		System.out.println("no of objects C::"+ count);
	}
}