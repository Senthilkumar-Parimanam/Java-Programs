package A_Basics.LanguageStructure.UserDefinedDataType.Class.NestedClass.AnonymClass;



 public class ImplmetingInterfaceAnonymClass {

  interface InterfaceEx{
   void testMethodA();
  }

  public static void main(String[] arg){

     Object anonymInterface = new InterfaceEx() {
      @Override
      public void testMethodA() {
        System.out.println(" Implementing method");
      }
      public Object newMethod(){
       System.out.println(" Adding new method & Creating new Object");
       testMethodA();
       return new Object();
      }
     }.newMethod();



  }


}
