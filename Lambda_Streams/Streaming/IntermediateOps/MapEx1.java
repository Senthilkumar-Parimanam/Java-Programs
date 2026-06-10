package Lambda_Streams.Streaming.IntermediateOps;

import java.util.ArrayList;
import java.util.List;

public class MapEx1 {
	
	
	public static void main(String[] arg) {
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		System.out.println("Upper case :: ");
		
		memberNames.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);  
		
		System.out.println("Lower case :: ");
		
		memberNames.stream()
        .map((value)-> value.toLowerCase())
        .forEach((t)-> System.out.println(t)); 
		
	}

}
