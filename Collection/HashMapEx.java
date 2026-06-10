package Collection;

import java.util.*;

public class HashMapEx {

    public static void main(String[] arg) {
        Student st1 = new Student("senthil", 100, 1000);
        Student st2 = new Student("kumar", 200, 10000);
        Student st3 = new Student("rajesh", 300, 2000);
        Student st4 = new Student("suresh", 100, 100000);
        Student st5 = new Student("gowtham", 100, 1000);

        HashMap<Student, String> hashMap = new HashMap<>();
        hashMap.put(st1, st1.getStudentName());
        hashMap.put(st2, st2.getStudentName());
        hashMap.put(st3, st3.getStudentName());
        hashMap.put(st4, st4.getStudentName());
        hashMap.put(st5, st5.getStudentName());

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Student,String> entry : hashMap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        List<String> valueList = hashMap.values().stream().toList();

        System.out.println(" Values ::: "+ valueList.toString());


    }


    }
