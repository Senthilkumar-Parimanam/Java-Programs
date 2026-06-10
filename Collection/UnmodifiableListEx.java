package Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListEx {


    public static void main(String[] arg){
        List<String> stList = new ArrayList<>();
        stList.add("hai"); stList.add("hello"); stList.add("Rajesh");
        System.out.println(" StList :: ");
        stList.forEach(value -> System.out.println(value));

        List<String> unmodifiableList = Collections.unmodifiableList(stList);
        System.out.println(" unmodifiableList :: ");
        unmodifiableList.forEach(value -> System.out.println(value));

        stList.add("ravi");
        System.out.println(" unmodifiableList After Original List changes  :: ");
        unmodifiableList.forEach(value -> System.out.println(value));

        unmodifiableList.add("kumar");
        System.out.println(" Adding value to unmodifiableList :: ");
        unmodifiableList.forEach(value -> System.out.println(value));
    }


}
