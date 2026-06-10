package A_Basics.SpecialClasses.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class IncrementDateBy1 {

    public static void main(String[] arg) throws ParseException {
        String date = "2024/03/20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));
        c.add(Calendar.DATE, 1);
        String date2 =  sdf.format(c.getTime());
        System.out.println(" Date2 : "+ date2);
    }


}
