package A_Basics.SpecialClasses.Date;

import java.time.LocalDate;

public class LocalDateAdditionEx {

    public static void main(String[] arg){
        LocalDate firstDate = LocalDate.now();
        LocalDate firstDatePlus1 = firstDate.plusDays(1);
        System.out.println(" firstDatePlus1 :: "+ firstDatePlus1);
        LocalDate secondDatePlus5 = firstDate.plusDays(5);
        System.out.println(" secondDatePlus5 :: "+ secondDatePlus5);




    }
}
