package A_Basics.OOPS.AbstractClass;

public class AbstractClassImpl extends AbstractClass {
	
	public static void main(String[] arg) {
		AbstractClassImpl ob = new AbstractClassImpl();
		ob.display();
		
	}

	@Override
	public void echo() {
		// TODO Auto-generated method stub
		
	}

	
}


abstract class AbstractClass{
	
	
	public AbstractClass() {
		System.out.println(" AbstractClass Constructor :: " );
	}
	
	public void display() {
		System.out.println(" Abstract Method ::  display" );
	}
	
	// Abstract class doesn't require to have default methods, but it has Concrete methods
	public abstract void echo();

	
}