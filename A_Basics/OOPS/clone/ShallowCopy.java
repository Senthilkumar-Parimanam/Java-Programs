package A_Basics.OOPS.clone;

public class ShallowCopy implements Cloneable{

	int no;
	String name;
	
	
	
	public static void main(String arg[]) throws CloneNotSupportedException {
		
		ShallowCopy ob = new ShallowCopy();
		ob.no = 100;
		ob.name = "Senthilkumar";
		ShallowCopy shCopy= null;
		shCopy = (ShallowCopy) ob.clone();
		System.out.println("name :"+shCopy.name);
		System.out.println("no :"+shCopy.no);
		
		
	}
	
	
	
}
