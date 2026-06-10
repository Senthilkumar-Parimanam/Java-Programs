package Lambda_Streams.Streaming.Problems;

import Lambda_Streams.Streaming.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class DepartHighSal {

    public static void main(String[] args){

        List<Employee> empList = new ArrayList<>();
        Map<String, Integer> resultMap = new HashMap<>();
        empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList())).forEach((key, values)->{
            Integer value = values.stream().map(Employee::getSalary).mapToInt(Integer::intValue).max().getAsInt();
            resultMap.put(key,value);
        });



    }


}
