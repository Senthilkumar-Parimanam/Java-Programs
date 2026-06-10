package Lambda_Streams.Streaming.IntermediateOps;

import java.util.ArrayList;
import java.util.List;

public class SortedEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		memberNames.stream().sorted()
        .forEach(System.out::println);

	}

}
