package Lambda_Streams.Streaming.IntermediateOps;

import java.util.ArrayList;
import java.util.List;

public class LimitEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		stringList.stream().limit(2)
		    .forEach( element -> { System.out.println(element); });  
		
	}

}
