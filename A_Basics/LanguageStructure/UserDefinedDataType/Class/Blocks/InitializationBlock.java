package A_Basics.LanguageStructure.UserDefinedDataType.Class.Blocks;

public class InitializationBlock extends B{

    {
        System.out.println(" Am in instance Block InitializationBlock Class");
    }

    static {
        System.out.println(" Am in static Block InitializationBlock Class");
    }

    InitializationBlock(){
        System.out.println(" Am in Constructor of InitializationBlock Class");
    }

    InitializationBlock(String msg){
        System.out.println(" Am in Overloaded Constructor of InitializationBlock Class");
    }

    public static void main(String[] arg){

        InitializationBlock ob = new InitializationBlock();

    }


}


class A {

    {
        System.out.println(" Am in instance Block A");
    }

   static {
        System.out.println(" Am in static Block A");
    }
    A(){
        System.out.println(" Am in Constructor of A Class");
    }

    A(String msg){
        System.out.println(" Am in Overloaded Constructor of A Class");
    }
}


class B extends A {

    {
        System.out.println(" Am in instance Block  B");
    }

    static {
        System.out.println(" Am in static Block  B");
    }
    B(){
        System.out.println(" Am in Constructor of B Class");
    }

    B(String msg){
        System.out.println(" Am in Overloaded Constructor of B Class");
    }
}
