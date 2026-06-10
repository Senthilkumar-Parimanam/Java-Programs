package A_Basics.SpecialClasses.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateEx1 {

    public static void main(String[] arg){

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println(now.format(formatter));
    }
}
