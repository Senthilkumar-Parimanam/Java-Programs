package A_Basics.SpecialClasses.String;

import java.util.stream.Stream;

public class EndofStringInParagraph {


    public static void main(String[] arg){

        String message = " rajesh|134|kumar|23434.454 445| 3434.454| \n senthil|15|saravana|3697.789 | 23655.454|";
        System.out.println(" message : "+ message);
        String[] lines = message.split("\\n");
        System.out.println(" line : "+ lines.length);
        for(String line: lines){
            System.out.println(" line : "+ line);
        }





    }


}
