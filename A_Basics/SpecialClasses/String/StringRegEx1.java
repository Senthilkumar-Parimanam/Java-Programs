package A_Basics.SpecialClasses.String;

public class StringRegEx1 {

    public static void main(String[] arg){

        String regex = "OU.*";
        String text1 = "OUE1";
        String text2 = "OUEQ";
        String text3 = "FR1M";

        boolean matches1 = text1.matches(regex);
        System.out.println(matches1);

        boolean matches2 = text2.matches(regex);
        System.out.println(matches2);

        boolean matches3 = text3.matches("FR.*");
        System.out.println(matches3);

    }
}
