package A_Basics.SpecialClasses.String;

public class TraverseString {


    public static void main(String[] arg){

        String st = "TRAILER:Processed <13> records";
        char[] charSt = st.toCharArray();
        StringBuilder valueSt = new StringBuilder();
        for(int i=0; i< charSt.length; i++){
            System.out.println(" char :  "+ charSt[i]);
            if((charSt[i] >= 48) && (charSt[i] <= 57 ) ){
                valueSt.append( String.valueOf(charSt[i]));
                System.out.println(" valueSt :  "+ valueSt);
            }
        }
        System.out.println(" Value Sting : "+ valueSt.toString());
        int value = Integer.parseInt(valueSt.toString());
        System.out.println(" Value  : "+ value);

    }


}
