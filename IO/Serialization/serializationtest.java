package IO.Serialization;

import java.io.*;

public class serializationtest {
	
	
	public static void main(String arg[]) throws IOException, ClassNotFoundException{
		
		//writeMethod();
		readMethod();
		
	
	}

	static void writeMethod() throws IOException{
		System.out.println("file is opened ");
		//C:\Users\sony\Desktop
		FileOutputStream fos = new FileOutputStream
				("C:\\Users\\sony\\Desktop\\object.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp = new Employee();
		emp.setName("kumar");
		emp.setNo(1000);
		emp.setSalary(25000);
		oos.writeObject(emp);
		System.out.println("Object is written in the file ");
	}
	
	static void readMethod() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream
				("C:\\Users\\sony\\Desktop\\object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee empdes = (Employee) ois.readObject();
		System.out.println("Deserialized object");
		System.out.println("Company name : "+empdes.getCompanyName());
		System.out.println("emp name : "+empdes.getName());
		System.out.println("emp no "+empdes.getNo());
		System.out.println("emp sal "+empdes.getSalary());
		//System.out.println("emp sal "+empdes.desig);
	}
	
}
