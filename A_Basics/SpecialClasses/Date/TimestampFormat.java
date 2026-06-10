package A_Basics.SpecialClasses.Date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampFormat {

    public static void main(String[] args) throws ParseException {

        System.out.println(" stringToDate ::  ");
        String stringDate = "2024-03-21 00:00:00";
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date dateValue = dateFormat.parse(stringDate);
        System.out.println(" dateFormat is ::  " + dateValue);


        Timestamp timestamp = new Timestamp(dateValue.getTime());
        System.out.println(" Timestamp :: " + timestamp);
        //timestamp =

    }

}
