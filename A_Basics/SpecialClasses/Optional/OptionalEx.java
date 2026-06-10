package A_Basics.SpecialClasses.Optional;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalEx {

	
	public static void main(String[] arg) {
		
		String name = null;
		ArrayList<String> list1 = null;
		Optional<ArrayList<String>> optionalList1 = Optional.ofNullable(list1);
		if (optionalList1.isPresent() && (optionalList1.get().size()>0)){
				System.out.println(" Optional.ofNullable :: isPresent nameValue :: "+ optionalList1.get().get(0));
		}else{
			System.out.println(" Optional.ofNullable :: false:: ");
		}
		/*if (optionalList1.isEmpty()) {
			System.out.println(" Optional.ofNullable :: isEmpty nameValue:: ");
		}
		ArrayList<String> list2 = new ArrayList<>();
		Optional<ArrayList<String>> optionalList2 = Optional.of(list2);
		if (optionalList2.isPresent()){
			System.out.println(" Optional.of isPresent() :: "+ optionalList1.get().get(0));
		}
		if (optionalList2.isEmpty()) {
			System.out.println("Optional.of empty :: isEmpty numberValue:: ");
		}
*/


		/*Optional<String> stringOptional =null;
		if (stringOptional.isEmpty()){
			System.out.println(" isPresent stringOptional :: "+ nameValue.get().get(0));
		} else if (stringOptional.isEmpty()) {
			System.out.println(" isEmpty stringOptional:: ");
		}*/
	}
	
	
}
