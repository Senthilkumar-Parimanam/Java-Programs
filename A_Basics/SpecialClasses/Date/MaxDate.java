package A_Basics.SpecialClasses.Date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class MaxDate {

    public static void main(String[] arg){
        /*Date maxDate = new Date(Long.MAX_VALUE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("The maximum date value in Java is: " + sdf.format(maxDate));
        Timestamp ts = new Timestamp(maxDate.getTime());
        Timestamp ts2 = new Timestamp(Long.MAX_VALUE);
        System.out.println("The maximum Timestamp is: " + ts);
        System.out.println("The maximum Timestamp is: " + ts2);*/
        /*java.sql.Date date = new java.sql.Date(sdf);
        System.out.println("SQL maximum date value in Java is: " + date);
         SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("The maximum date value in Java is: " + sdf2.format(date));*/
        java.sql.Date createdDate = new java.sql.Date(System.currentTimeMillis());
        System.out.println("The created date : " + createdDate);
        Date eot = java.sql.Date.valueOf(LocalDate.of(9999, Month.DECEMBER, 31));
        System.out.println("The maximum date : " + eot);

    }


}
