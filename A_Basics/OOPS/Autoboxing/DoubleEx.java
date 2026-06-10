package A_Basics.OOPS.Autoboxing;

import java.math.BigDecimal;

public class DoubleEx {

    public static void main(String[] arg){

        String st1 = "0";
        Double doubleValue1 = Double.valueOf(st1);
        System.out.println(" St1 : "+ st1);


        String st ="1234.54";
        Double doubleValue = Double.valueOf(st);
        System.out.println(doubleValue);
        System.out.println(doubleValue.intValue());
        Long value=  Long.valueOf(doubleValue.intValue());
        System.out.println(value);
        System.out.println(String.valueOf(value));

        BigDecimal decimal = BigDecimal.valueOf(doubleValue);
        System.out.println(" Decimal :: "+ decimal);



    }


}
