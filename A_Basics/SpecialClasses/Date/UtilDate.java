package A_Basics.SpecialClasses.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDate {

    public static void main(String[] arg) throws ParseException {
            /*java.util.Date utilDate = new java.util.Date();
        Date sqlDate = new Date(utilDate.getTime());
        System.out.println("Sql Date is : "+ sqlDate);
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        Date date = (Date) format.parse(st);
        System.out.println("SQL Date : "+ date);*/


        java.util.Date utilDate = new Date();
        System.out.println("Sql Date is : "+ utilDate);
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
        String dateSt = format.format(utilDate);
        System.out.println("dateSt  : "+ dateSt);
        SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yyyy");
        Date convertedDate = format2.parse(dateSt);
        System.out.println("convertedDate  : "+ convertedDate);


    }

}
