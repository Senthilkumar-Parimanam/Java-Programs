package IO.Serialization;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private  static String companyName = "Microsoft";
	private float salary;
	private String desig = "ITA";
	
	Employee(){
		
	}
	
	public static String getCompanyName(){
		return companyName;
	} 
	
	public static void setEmpNo(String companyName){
		companyName = companyName;
	}
	
	public float getSalary(){
		return salary;
	}
	
	public void setSalary(float sal){
		this.salary = sal;
	}
	
	
	
}



class Person {
	
	private  int no;
	private String name;
	
	Person(){
	/*	no = 100;
		name = "Senthilkumar";*/
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getNo(){
		return no;
	}
	
	public void setNo(int no){
		this.no = no;
	}
	
}