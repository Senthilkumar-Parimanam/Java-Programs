package A_Basics.OOPS.clone;

public class TestClass {

	
	public static void main(String arg[]){
		
		Address add= new Address("Mount Pleasent", "Reading");
		
		Person origPerson = new Person("Senthil","200",add);
		
		System.out.println(" Name : "+ origPerson.getName());
		System.out.println(" empNo : "+ origPerson.getEmpNo());
		System.out.println(" Address: Street : "+ origPerson.getAddress().getStreet());
		System.out.println(" Address: City : "+ origPerson.getAddress().getCity());
	
		
		Person clonePerson =  origPerson.clone();
		
		System.out.println(" Name : "+ clonePerson.getName());
		System.out.println(" empNo : "+ clonePerson.getEmpNo());
		System.out.println(" Address: Street : "+ clonePerson.getAddress().getStreet());
		System.out.println(" Address: City : "+ clonePerson.getAddress().getCity());
	
	}

	
	
}
