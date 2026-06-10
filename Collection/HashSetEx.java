package Collection;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetEx {


    public static void main(String[] arg){
        Student st1 = new Student("senthil", 100,1000 );
        Student st2 = new Student("kumar", 200,10000 );
        Student st3 = new Student("rajesh", 300,2000 );
        Student st4 = new Student("suresh", 100,100000 );
        Student st5 = new Student("gowtham", 100,1000 );

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(st1);
        hashSet.add(st2);
        hashSet.add(st3);
        hashSet.add(st4);
        hashSet.add(st5);


        for(Student st: hashSet){
            System.out.println(st.getStudentName());
        }




    }

}
