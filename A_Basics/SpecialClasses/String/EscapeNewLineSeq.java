package A_Basics.SpecialClasses.String;

public class EscapeNewLineSeq {


    public static void main(String[] arg){
        String  st = "This is test message \n for Testing \n Let see \n how it goes";
        //System.out.println(st);
        String[] stList = st.split("\n");

        for(String str: stList){
            System.out.println(str);
        }

    }



}
