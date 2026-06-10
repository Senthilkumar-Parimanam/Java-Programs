package A_Basics.SpecialClasses;

import java.text.DecimalFormat;

public class MathClass {

    public static void main(String[] arg){
        Double doubleValue = Double.valueOf(10.7889);
        System.out.println(" double value :: "+ doubleValue);
        Double roundValue = (double) Math.round(doubleValue);
        System.out.println(" double value :: "+ roundValue);

        double time = 200.899899456;
        DecimalFormat df = new DecimalFormat("#.##");
        time = Double.valueOf(df.format(time));

        System.out.println(time);

    }


}
