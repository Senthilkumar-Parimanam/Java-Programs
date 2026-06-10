package Lambda_Streams.Streaming.Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCodingQuestions {


    public static void main(String[] arg){

    }


    public static void findEven(){
        List<Integer> intList = Arrays.asList(12, 5, 7, 18, 50);
        List<Integer> evenList = intList.stream().filter( e->e %2 == 0).collect(Collectors.toList());
        evenList.forEach(e-> System.out.println(e));
    }

    public static void strUpperCase(){

        IntStream intStream = IntStream.of(1,2,3,4,5);
        //Collections.frequency()
        System.out.println("Max :: "+ intStream.max());




    }


}
