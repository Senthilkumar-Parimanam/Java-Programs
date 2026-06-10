package Lambda_Streams.Streaming.IntermediateOps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapEx1 {
	
	
	public static void main(String[] arg) {
		
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream1 = stringList.stream();
		System.out.println("Using flat Map:::");
		
		stream1.flatMap((value) -> {
		    String[] split = value.split(" ");
		    return (Stream<String>) Arrays.asList(split).stream();
		}).forEach((value) -> System.out.println(value));
		
		System.out.println("Using Map:::");
		Stream<String> stream2 = stringList.stream();
		stream2.map((value) -> {
		    String[] split = value.split(" ");
		    return (Stream<String>) Arrays.asList(split).stream();
		}).forEach((value) -> System.out.println(value));
		
	}

}
