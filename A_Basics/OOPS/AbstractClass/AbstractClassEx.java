package A_Basics.OOPS.AbstractClass;

public class AbstractClassEx extends TestEx{

    public static void main(String[] arg){
        AbstractClassEx ex = new AbstractClassEx();
        ex.message();
    }

}



abstract class TestEx {

  //  public abstract void test();

    public void message(){
        System.out.println(" This is abstract class");
    }

}