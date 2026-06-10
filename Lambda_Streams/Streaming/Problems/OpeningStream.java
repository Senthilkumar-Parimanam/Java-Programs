package Lambda_Streams.Streaming.Problems;

import java.util.*;

public class OpeningStream {

    public static void main(String[] arg){

        List<Integer> list = new ArrayList<>();
        list.stream();

        Map<String, String> map = new HashMap<>();

        Set<String> set = new TreeSet<>();

        set.stream();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.stream();

        HashSet<String> hashSet = new HashSet<>();
        hashSet.stream();

        Optional<EmployeeEntity> optionalOpeningStream = Optional.of(new EmployeeEntity());

        EmployeeEntity ob = optionalOpeningStream.orElse(new EmployeeEntity());


    }


}
