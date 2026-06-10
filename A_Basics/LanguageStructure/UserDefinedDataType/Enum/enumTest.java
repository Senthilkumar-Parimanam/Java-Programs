package A_Basics.LanguageStructure.UserDefinedDataType.Enum;

public class enumTest {

 enum Singelton{
	 SENTHIL("Senthil", "kumar", "100"),
	 KAVI("kavi", "arasan","200"),
	 SARAVANA("Saravana","kumar","300");
	 
	 private String firstName;
	 private String lastName;
	 private String empId;
	 
	 private Singelton(String firstName,String lastName, String empId){
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.empId = empId;
	 }
	 
	 public String getFirstName(){
		 return firstName;
	 }
	 
	 public String getLastName(){
		 return lastName;
	 }
	
	 public String getEmpId(){
		 return empId;
	 }
	 
	
}
 
 public static void main(String arg[]){
		Singelton ob = Singelton.SENTHIL;
		System.out.println(" First Name is  "+ob.getFirstName() );
		System.out.println(" last Name is  "+ob.getLastName() );
		System.out.println(" Emp id is  "+ob.getEmpId() );
		
		Singelton ob1 = Singelton.KAVI;
		Singelton.KAVI.empId = "2000";
		System.out.println(" First Name is  "+ob1.getFirstName() );
		System.out.println(" last Name is  "+ob1.getLastName() );
		System.out.println(" Emp id is  "+ob1.getEmpId() );
		
 }	
  
 
}
