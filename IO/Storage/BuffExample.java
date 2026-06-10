package IO.Storage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffExample {
	
	public static void main(String[] arg){
		
	String content = " Hai this is Senthilkumar, creating test file "
			+ "to check Buffered writer and File writer";
	
	try {
		FileWriter file = new FileWriter("C:\\Users\\sony\\Desktop\\test1.txt");
		BufferedWriter writer = new BufferedWriter(file);
		writer.write(content);
		writer.close();
		file.close();

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
