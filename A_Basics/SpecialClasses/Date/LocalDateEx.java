package A_Basics.SpecialClasses.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class LocalDateEx {

    public static void main(String[] arg) throws ParseException {
        String dateTimeSt = "2024-03-21 00:00:00";
         String [] str = dateTimeSt.split(" ");
         LocalDate date =  LocalDate.parse(str[0]);
          //LocalDate dateTime = new LocalDate(str[0]);
        System.out.println(" dateTime is : "+date);
        int dateValue = date.getDayOfMonth();
        System.out.println(" dateValue is : "+dateValue);
        int monthValue = date.getMonthValue();
        System.out.println(" Month Value :  "+ monthValue);
        Month month =    date.getMonth();
        System.out.println(" month is : "+month.name());
        System.out.println(" month is : "+month.getDisplayName(TextStyle.SHORT_STANDALONE, Locale.ENGLISH));
        int year = date.getYear();
        System.out.println(" year is : "+year);
        String strDate = dateValue+"-"+month.getDisplayName(TextStyle.SHORT_STANDALONE, Locale.ENGLISH)+"-"+year;
        System.out.println(" strDate is : "+strDate);
        SimpleDateFormat stFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date resultDate = stFormat.parse(strDate);
        System.out.println(" resultDate is ::  "+resultDate );

        StringBuilder  builderDate = new StringBuilder();
        builderDate.append(dateValue).append(monthValue).append(year);
        System.out.println(" String Date :: "+ builderDate);






    }
}
