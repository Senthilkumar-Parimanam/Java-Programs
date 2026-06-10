package A_Basics.OOPS.clone;

public class Person implements Cloneable{

	private String name;
	private String empNo;
	private Address address;
	
	public Person(String name, String empNo,Address address){
		this.name = name;
		this.empNo = empNo;
		this.address = address;
	}
	
	public Person(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address; 
	}
	
	public int hashCode(){
		return name.hashCode()+empNo.hashCode();
	}
	
	public boolean equal(Person ob){
		if(this.name.equalsIgnoreCase(name) && this.empNo.equalsIgnoreCase(empNo))
				return true;
		else 
			return false;
		
		
	}
	
	protected Person clone(){
		
		Person clonePerson = new Person();
		clonePerson.setEmpNo(this.getEmpNo());
		clonePerson.setName(this.getName());
		Address cloneadd = new Address(address.getStreet(),address.getCity());
		clonePerson.setAddress(cloneadd);
		return clonePerson; 
		
	}

	
	
	
	
	
	
}


class Address{
	
	private String street;
	private String city;
	
	public Address(String street, String city){
		this.street = street;
		this.city = city;
	}
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}