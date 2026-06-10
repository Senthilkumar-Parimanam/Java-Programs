package IO.Storage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileRead {

    public static void main(String[] arg) throws FileNotFoundException {

        FileReader reader = new FileReader("C:\\Users\\sony\\Desktop\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);




    }

}
