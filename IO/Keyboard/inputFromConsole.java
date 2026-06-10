package IO.Keyboard;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputFromConsole {
	
	public static void main(String arg[]) throws IOException{
		
		// we can get input from 3 ways
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the line");
		String bufferSt = br.readLine();
		System.out.println("Buffered Reader : "+ bufferSt);

		//Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the int value");
		int scanInt = scan.nextInt();
		System.out.println("Scanner : "+ scanInt);

		//Console
		Console con = System.console();
		System.out.println(" Enter the Line for Console" + con);
		String conSt = con.readLine();


		//System.out.println("Console :"+ conSt);
	
	
		
			
	}
}