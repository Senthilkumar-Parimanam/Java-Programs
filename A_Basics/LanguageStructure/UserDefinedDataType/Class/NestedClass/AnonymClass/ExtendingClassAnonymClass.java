package A_Basics.LanguageStructure.UserDefinedDataType.Class.NestedClass.AnonymClass;

public class ExtendingClassAnonymClass {

	public class AnnClass{
		String st;
		AnnClass(String st ){
			this.st = st;
		}
		public void methodA() {
			System.out.println("Base class method A");
		}
	}
	

	public void methodForAnnoymA() {
		AnnClass annonymObj = new AnnClass("Hai") {

			@Override
			public void methodA(){
				System.out.println(" Overridded method A: "+st);
			}

			public AnnClass methodB() {
				System.out.println("This is new method B");
				return new AnnClass("Hello");
			}
		}.methodB();
		annonymObj.methodA();
		
	}
	


	public void methodForAnnoymB() {
		AnnClass annonymObj = new AnnClass("Hai") {

			@Override
			public void methodA(){
				System.out.println(" Overridded method A: "+st);
			}
	
		};
		annonymObj.methodA();
		
	}
	
	
	public static void main(String[] arg) {
		ExtendingClassAnonymClass ob = new ExtendingClassAnonymClass();
		ob.methodForAnnoymA();
		ob.methodForAnnoymB();
				
		
	}
	
	
}
