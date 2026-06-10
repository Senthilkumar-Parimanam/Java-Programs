package A_Basics.SpecialClasses.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class ZoneLocalDateTimeEx {

    public static void main(String[] arg) throws ParseException {


        getCurrentDateSt();


    }


    public void getCurrentZonedDateTime() throws ParseException {

        ZonedDateTime tzInstance = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("tzInstance :: "+tzInstance);  //2022-02-15T07:13:51.519251200Z[GMT]
        System.out.println("tzInstance.toString() :: "+tzInstance.toString());
        System.out.println("tzInstance.toLocalDate() ::"+ tzInstance.toLocalDate());
        LocalDateTime dateTime = tzInstance.toLocalDateTime();
        LocalTime time = tzInstance.toLocalTime();
        System.out.println("dateTime ::"+ dateTime);
        System.out.println("dateTime String ::"+ dateTime.toString());
        System.out.println("date ::"+ tzInstance.toLocalDate());
        System.out.println("date String ::"+ tzInstance.toLocalDate().toString());
        System.out.println("time() ::"+ tzInstance.toLocalTime());
        System.out.println("time() ::"+ tzInstance.toLocalTime().toString());
        String dateTimeSt = tzInstance.toLocalDate().toString()+" " + tzInstance.toLocalTime().toString();
        System.out.println(" dateTime String :: "+ dateTimeSt);
        String dateTimeStValue = dateTimeSt.split("\\.")[0];
        System.out.println(" dateTime String Value :: "+ dateTimeStValue);

        String dateSt = tzInstance.toLocalDate().toString();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = simpleDateFormat.parse(dateSt);
        String formattedDate = simpleDateFormat.format(date1);
        System.out.println(" formatted Date :: "+ formattedDate);


    }


    public static void getCurrentDateSt(){

        ZonedDateTime tzInstance = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("tzInstance :: "+tzInstance);  //2022-02-15T07:13:51.519251200Z[GMT]
        System.out.println("tzInstance.toString() :: "+tzInstance.toString());
        LocalDate currentDate = tzInstance.toLocalDate();
        System.out.println("currentDate ::"+ currentDate);
        LocalDate nextDate = currentDate.plusDays(1);
        System.out.println("nextDate ::"+ nextDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        String dateSt = formatter.format(nextDate);
        System.out.println(" Date String : "+ dateSt);


    }




}
