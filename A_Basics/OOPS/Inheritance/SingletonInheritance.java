package A_Basics.OOPS.Inheritance;

public class SingletonInheritance  {
    //extends  Singleton{

    // Class with private constructor can't be extended.
    // error -> There is no default constructor available in 'A_Basics.OOPS.Inheritance.Singleton'

}


class Singleton  {

    static SingletonInheritance singleton= null;

    String state = "This is Singleton Object";
    private Singleton(){

    }

    public String getState(){
        return state;
    }

    public static SingletonInheritance getSingleton(){
        if (singleton == null){
            singleton = new SingletonInheritance();
        }
        return singleton;
    }






}