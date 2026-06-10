package A_Basics.SpecialClasses.String;

public class RemoveLastComma {
	
	
	public static void main(String[] arg) {
		

		
	}

	public static void removeLastComma(){
		StringBuffer st1 = new StringBuffer();
		st1.append("hai hello.txt").append(",");
		System.out.println("Length : "+ st1.length());
		System.out.println("St1 : "+ st1);
		st1.deleteCharAt(st1.length()-1);
		System.out.println("St1 : "+ st1);
	}

	public static void removeQuotes(){
		StringBuffer st1 = new StringBuffer();
		st1.append("\"hai \" hello.txt\"");
		System.out.println("St1 : "+ st1);
		//String st2 = st1.re
		st1.deleteCharAt(st1.length()-1);
		System.out.println("St1 : "+ st1);
	}


}
