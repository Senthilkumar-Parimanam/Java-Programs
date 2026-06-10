package A_Basics.SpecialClasses.Date;

import java.sql.Date;
import java.time.LocalDate;

public class SqlDate {

    public static void main(String[] arg){
        Date sqlDate = new Date(System.currentTimeMillis());
        //System.out.println(" Sql Date is :: "+sqlDate );
        java.util.Date utilDate = new java.util.Date();
        convertToDate();
    }

    private static void convertToDate(){
        String st = "2014-11-03 00:00:00";
        String str = st.replaceAll(":*$", "");
        System.out.println(str);



       /* String st = "2014-11-03 00:00:00";
        String[] stArray = st.split("\\-");
        for(int i=0; i < stArray.length; i++){
            System.out.println(stArray[i]);
        }*/


        /*LocalDate t = LocalDate.parse("2014-11-03 00:00:00"
                .replaceFirst(" :*$", "")); // Remove time part
        java.sql.Date time = java.sql.Date.valueOf(t);
        System.out.println(" Sql Date is  :: "+ time);*/

    }


}
