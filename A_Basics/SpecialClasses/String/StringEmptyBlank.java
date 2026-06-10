package A_Basics.SpecialClasses.String;

public class StringEmptyBlank {

    public static void main(String[] arg){

        String st ="  ";
        System.out.println(" Empty" + st.isEmpty());

        if(st.isBlank()){
            System.out.println(" Blank" + st.isBlank());
        }

        String st1 = null;
        if(st1 != null &&  st1.isBlank()){

        }else {
            System.out.println( " null");
        }

    }

}
