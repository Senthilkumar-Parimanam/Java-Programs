package Lambda_Streams.Streaming.Problems;

import A_Basics.OOPS.clone.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	
	public static void main(String[] arg) {
		
		List<Integer> intList = Arrays.asList(10, 33, 4,1,9 );
		intList.stream().filter((i)-> i > 10).forEach(System.out::println);
		//.forEach(System.out::println);
				
		
		
	}
	
	
	
}
