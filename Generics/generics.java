package Generics;

import java.util.ArrayList;
import java.util.List;

public class generics {
	
	
	public static void main(String arg[]){
		
		List<?> listObj;
		List<Number> listNumber;
		List<Integer> listInt = new ArrayList<>();
		// listNumber = listInt;
		// List<Integer> cant be assigned to List<Number>
		listObj = listInt;
		
	}

}
