package A_Basics.LanguageStructure.UserDefinedDataType.Interface;

public class multipleInheritance extends hai implements hello{
	
  public void method(){
	  System.out.println("I am in multipleInheritance");
  }
	
	
}

class hai {
	public void method(){
		System.out.println("I am from class hai");
	}
}

interface hello{
	void method();
}

