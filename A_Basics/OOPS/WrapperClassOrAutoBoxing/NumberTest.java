package A_Basics.OOPS.WrapperClassOrAutoBoxing;

public class NumberTest {

	public static void main(String[] arg) {
		int no = 0010;
		System.out.println("Value :: "+ no);
		
		Integer value = Integer.valueOf(10);
		System.out.println("Value :: "+ value.intValue());
		
		Integer value2 = Integer.valueOf(0010);
		System.out.println("Value2 :: "+ value.intValue());
	}
	
}
