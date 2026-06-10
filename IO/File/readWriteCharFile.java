package IO.File;

import java.io.*;

public class readWriteCharFile {

	public static void main(String arg[]) throws IOException {

		FileReader fileReader;

		fileReader = new FileReader("C:\\Users\\Senthil\\Desktop\\airtel.txt");
		BufferedReader buffRead = new BufferedReader(fileReader);
		System.out.println("Reading content from file ");
		String st = null;
		while ((st = buffRead.readLine()) != null) {
			System.out.println(st);

		}
		buffRead.close();

		FileWriter fileWriter;
		fileWriter = new FileWriter("C:\\Users\\Senthil\\Desktop\\test.txt",true);
		BufferedWriter buffWrit = new BufferedWriter(fileWriter);
		System.out.println("Reading content from file ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while(!(str = input.readLine()).equals("close")){
			System.out.println("Content is:  ");
			buffWrit.write(str);
		}
		buffWrit.close();
		input.close();

	}

}
