package Lambda_Streams.Streaming.IntermediateOps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		
		List<String> distinctStrings = stringList.stream().distinct()
		        .collect(Collectors.toList());

		System.out.println(distinctStrings);

	}

}
