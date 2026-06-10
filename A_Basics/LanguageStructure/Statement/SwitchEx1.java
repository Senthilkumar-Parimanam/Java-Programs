package A_Basics.LanguageStructure.Statement;

public class SwitchEx1 {

    public static void main(String[] arg){

        Object value = (Object) Integer.valueOf(100);
        String result = switch (value){
            case  Integer i  -> "Integer : "+ i;
            case String  s -> " String : "+ s;
            default -> "unkonwn type";
        };
        System.out.println(" result is  :: "+ result);

        Days dayValue = Days.SATURDAY;
        String dayType = switch (dayValue){
            case SATURDAY, SUNDAY ->  "Weekend";
            default -> "Weekday";
        };

        System.out.println(" dayType is  :: "+ dayType);



    }
}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}