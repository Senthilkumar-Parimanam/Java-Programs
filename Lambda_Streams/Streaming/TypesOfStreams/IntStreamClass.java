package Lambda_Streams.Streaming.TypesOfStreams;

import java.util.stream.IntStream;

public class IntStreamClass {

    public static void main(String[] arg){

        IntStream intStream = IntStream.of(1,2,3,4,5);
        int max = intStream.max().getAsInt();
        int sum = intStream.sum();
        System.out.println(" max :: "+ max);
        System.out.println(" Sum :: "+ sum);

    }


}
