package A_Basics.SpecialClasses.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysStringList {

    public static void main(String[] arg){

        String[] st = {"hai", "hello", "how"};
        List<String> stArrayList = (List<String>) Arrays.asList(st);
        for (String str:stArrayList) {
            System.out.println(" values: "+ str);
        }
        System.out.println(stArrayList.toString());
    }

}
