package Lambda_Streams.Streaming.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {


    public static List<EmployeeEntity> getEmpList(){
        List<EmployeeEntity> empList = new ArrayList<>();
        empList.add(new EmployeeEntity(100,"Senthil","teammember",1000));
        empList.add(new EmployeeEntity(200,"Kumar","teammember",2000));
        empList.add(new EmployeeEntity(300,"Arun","teammember",3000));
        empList.add(new EmployeeEntity(400,"Varun","Leader",10000));
        empList.add(new EmployeeEntity(500,"Saravana","teammember",4000));
        empList.add(new EmployeeEntity(600,"Ashok","teammember",5000));
        return empList;
    }

    public static void main(String[] arg){
    final List<EmployeeEntity> empList = getEmpList();
    List<EmployeeEntity> resultList = empList.stream().filter(
            emp->emp.getDesignation().equals("teammember")
            && emp.getSalary()>=3000).collect(Collectors.toList());
    resultList.stream().forEach(System.out::println);




    }
}
