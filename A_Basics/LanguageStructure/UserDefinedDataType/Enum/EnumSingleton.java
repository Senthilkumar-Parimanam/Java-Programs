package A_Basics.LanguageStructure.UserDefinedDataType.Enum;

public class EnumSingleton {

	
 enum Singleton {
	 ONlYONE_INSTANCE("senthil","kumar");

     // Values within the paranthesis denote property or state of an Instance

    // these two variables are used to refer the values or state of the property of an Instance
     private String firstName;
     private String lastName;

     Singleton(String firstName, String lastName){
         this.firstName = firstName;
         this.lastName = lastName;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName){
          this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName){
         this.lastName = lastName;
     }

 }


 public static void main(String[] arg){
  Singleton object = Singleton.ONlYONE_INSTANCE;
  System.out.println(" State of first property : firstName is :: "+ object.getFirstName());
  System.out.println(" State of second property : lastName is :: "+ object.getLastName());
  object.setFirstName("Senthilkumar");
  object.setLastName("Parimanam");
  System.out.println(" State of first property : firstName is :: "+ object.getFirstName());
  System.out.println(" State of second property : lastName is :: "+ object.getLastName());



 }
	
}
