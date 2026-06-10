package A_Basics.LanguageStructure.UserDefinedDataType.Class;

public class TestingOrderOfClass {

    public static void main(String[] arg){
        B ob = new B();

    }
}

class A{
    {
        System.out.println(" A initialization Block");
    }
   static {
        System.out.println(" A Static initialization Block");
    }
    A(){
        System.out.println(" A Consturctor");
    }
}

class B extends A{
    {
        System.out.println(" B initialization Block");
    }
    static {
        System.out.println(" B Static initialization Block");
    }
    B(){
        System.out.println(" B Consturctor");
    }
}