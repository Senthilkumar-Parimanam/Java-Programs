package A_Basics.SpecialClasses.String;

public class CharCompare {
	
	public static void main(String[] a) {
		String st = "010";
		char[] ch1 = st.toCharArray();
		char[] ch2 = {'0','1','0'};
		int count = 0;
		for(int i =0; i<=2 ; i++) {
			if(ch1[i] == ch2[i])
				++count;
		}
		System.out.println(count);
		
		
	}

}
