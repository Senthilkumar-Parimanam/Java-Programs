package A_Basics.SpecialClasses.String;

public class StringCompareEx {

    public static void main(String[] arg){
        String arg1 = null;
        String arg2 = "test";
        if(arg2.equalsIgnoreCase(arg1)){
            System.out.println(" null comparision works");
        }
        /*if(arg1.equalsIgnoreCase(arg2)){
            System.out.println(" null checks");
        }*/
        String arg3 = null;
        if(arg2 == arg3){
            System.out.println(" null comparision");
        }

    }
}
