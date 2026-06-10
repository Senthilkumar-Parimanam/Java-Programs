package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListEx {



    public static void main(String[] arg){
        List<String> stList = new ArrayList<>();
        stList.add("hai"); stList.add("hello"); stList.add("Rajesh");
        System.out.println(" StList :: ");
        stList.forEach(value -> System.out.println(value));

        List<String> immutableList = List.copyOf(stList);
        System.out.println(" immutableList :: ");
        immutableList.forEach(value -> System.out.println(value));

        stList.add("ravi");
        stList.add("raja");
        System.out.println(" immutableList after addition to original list:: ");
        immutableList.forEach(value -> System.out.println(value));


        List<Integer> intList = List.of(12,11,111,1122,33); // Immutable List
        intList.add(333); // We cant add value, since it is immutable


    }


}
