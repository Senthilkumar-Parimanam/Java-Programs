package A_Basics.SpecialClasses.String;

public class StringReplaceEx {

    public static void main(String[] arg){

        String s = "Replace\n"
                + " all\n"
                + " line\n"
                + " breaks\n"
                + " from\n"
                + " strings";

        System.out.println(
                "Original String with line breaks - " + s);

        // replacing line breaks from string
        s = s.replace("\n", "");
        //s.indexOf()

        System.out.println(
                "String after replacing line breaks - " + s);
    }




}
