package Lambda_Streams.Streaming.StreamBySources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class StreamFromFile {

    public static void main(String[] arg) throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        Stream<String> lines = br.lines();

        String st = "asdf";


    }
}
