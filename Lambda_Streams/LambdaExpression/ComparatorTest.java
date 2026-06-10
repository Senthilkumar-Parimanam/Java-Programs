package Lambda_Streams.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
    
	 ComparatorTest ob = new ComparatorTest();
	   
     List<Person> personList = new ArrayList<Person>();
     personList.add(new Person("Senthil","Raja"));
     personList.add(new Person("Saravana","kumar"));
     personList.add(new Person("Rajesh","prasath"));
     
   
     // Sort with Inner Class
     Collections.sort(personList, new Comparator<Person>(){
       public int compare(Person p1, Person p2){
         return p1.getFirstName().compareTo(p2.getFirstName());
       }
     });
     
     System.out.println("=== Sorted using Anonymous Class ===");
     for(Person p:personList){
       System.out.println(p.getFirstName()+" "+p.getLastName());
     }
     
     // Use Lambda instead
     
      System.out.println("=== Sorted using Lambda expression ===");
     Collections.sort(personList, (Person p1, Person p2)-> p1.getLastName().compareTo(p2.getLastName()));
    		 
     for(Person p:personList){
    	 System.out.println(p.getFirstName()+" "+p.getLastName());
     }
     
     // Method Reference
     System.out.println("=== using Method Reference type1 ===");
     Collections.sort(personList, Person.compareByFirstName);
     for(Person p:personList){
         System.out.println(p.getFirstName()+" "+p.getLastName());
       }
     
     System.out.println("=== using Method Reference type2 ===");
     Person person = new Person();
     Collections.sort(personList, person::compareByLastName);
     for(Person p:personList){
         System.out.println(p.getFirstName()+" "+p.getLastName());
       }
      
   }
 }

 class Person{
	  String firstName;
	  String lastName;
	 
	Person(){}
	  
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public final static Comparator<Person> compareByFirstName = 
	   (Person p1, Person p2)-> p1.getFirstName().compareTo(p2.getFirstName());
	  
	public int compareByLastName(Person a, Person b) {
	        return a.getLastName().compareTo(b.getLastName());
	    }
}
	