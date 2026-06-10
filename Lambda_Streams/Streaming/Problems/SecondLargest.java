package Lambda_Streams.Streaming.Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SecondLargest {


    public static void main(String[] arg){

      //  10, 5, 20, 15, 25

        //{11, 4, 68,55,83, 78};
        //{5, 5, 5}
        int[] numbers = { 10, 20};
        int big1, big2 ;
        big1 = numbers[0];
        big2 = numbers[0];
        for(int i=1; i < numbers.length; i++){
            if(big1 < numbers[i]){
                big2 =  big1;
                big1 = numbers[i];
            }else{
                if(big2 < numbers[i]){
                    big2 = numbers[i];
                }
            }
        }
        System.out.println(" 1st Big is :: "+big1 +" , Big2: "+big2);


    }


    void secondBig(){
        int[] numbers = {11, 4, 68,55,83, 78};
        int big1, big2 ;
        big1 = numbers[0];
        big2 = numbers[0];
        for(int i=1; i < numbers.length; i++){
            if(big1 < numbers[i]){
                big2 =  big1;
                big1 = numbers[i];
            }else{
                if(big2 < numbers[i]){
                    big2 = numbers[i];
                }
            }
        }
        System.out.println(" 1st Big is :: "+big1 +" , Big2: "+big2);

    }

}
