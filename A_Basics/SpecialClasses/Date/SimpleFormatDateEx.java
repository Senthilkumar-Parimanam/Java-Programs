package A_Basics.SpecialClasses.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class SimpleFormatDateEx {

    public static void main(String[] arg) throws ParseException {
        stringToDate();
    }


    public static void stDate(){

    }

    public static void convertion(){
        String st =  "2014-11-03 00:00:00";
        //String st1 = "Testing file";
        String[] split1  = st.split(" ");
        //LocalDate date = LocalDate.parse(split1[0]);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(split1[0], formatter);
        System.out.println(date);
    }



    public static void stringToDate() throws ParseException {
        System.out.println(" stringToDate ::  "  );
        String stringDate = "2024-03-21";
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date dateValue = dateFormat.parse(stringDate);
        System.out.println(" dateFormat is ::  "+dateValue );
        SimpleDateFormat stFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String dateSt = stFormat.format(dateValue);
        //String convertDate = stFormat.format(dateSt);
         System.out.println(" convertDate is ::  "+dateSt );
         Date resultDate = stFormat.parse(dateSt);
        System.out.println(" resultDate is ::  "+resultDate );

    }


    public static void getDate () throws ParseException {

        Date date = new Date();
        System.out.println("Date is : "+ date);
        //SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        String dateSt = format.format(date);
        System.out.println(" Date in String : "+ dateSt);
        Date currentDate = format.parse(dateSt);
        System.out.println(" Current formatted Date is : "+ currentDate);
    }


    public static void getDateSt() throws ParseException {
        String dateSt = "10/22/2022";
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = format.parse(dateSt);
        System.out.println(" Date value :: "+ date1);
        String st = format.format(date1);
        System.out.println(" st value :: "+ st);

    }




}
