package A_Basics.SpecialClasses.Date;

import java.time.*;

public class LocalDateTimeMinus {

    public static void main(String[] arg) {

        ZonedDateTime tzInstance2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        LocalDateTime dateTimeEnd = tzInstance2.toLocalDateTime();
        System.out.println("dateTimeEnd ::" + dateTimeEnd);

        LocalDateTime dateTimeStart = tzInstance2.toLocalDateTime().plusMinutes(20).plusSeconds(30);
        System.out.println("dateTimeStart ::" + dateTimeStart);

        Duration duration = Duration.between(dateTimeEnd, dateTimeStart);
        System.out.println(" Duration :: " + duration.toString());

        System.out.println(" Duration in Minutues :: " + duration.getSeconds());
        LocalDate firstDate = tzInstance2.toLocalDate();




    }


}
