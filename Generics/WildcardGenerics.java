package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardGenerics {

	// Generic Type T, you are defining the new type T, so you can Read,Write and add to the collections
	
		
	// WildCard is UNKONWN TYPE, so you can perform operations ONLY in Object class and READING values  
	public static void wildCardUnbound(List<?> wildList){

		for(int i=0; i<wildList.size();i++){
			System.out.println(wildList.get(i));
		}
	}
		
	public static<T> void wild(List<?extends T> ob){


		for(int i=0; i<ob.size();i++){
			System.out.println(ob.get(i));
		}
	}
	
	public static void wildCardUpBound(List<? extends Number> wildList){
		System.out.println("wildCardUpBound");
		//wildList.add(30);
		for(int i=0; i<wildList.size();i++){
			System.out.println(wildList.get(i));
		}
	}

	public static void wildCardLowerBound(List<? super Integer> wildList){
		System.out.println("wildCardLowerBound");
		wildList.add(70);
		for(int i=0; i<wildList.size();i++){
			System.out.println(wildList.get(i));
		}
	}
	
	public static void main(String arg[]){
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		wildCardLowerBound(intList);
		/*//List<Integer>
		wildCardUpBound(intList);
		List<Double> dobList = new ArrayList<Double>();
		dobList.add(new Double("10.0"));
		dobList.add(new Double("20.0"));
		dobList.add(new Double("30.0"));
		wildCardUpBound(dobList);*/
		
	/*	//Calling unbound wild cards
		List<String> stList = new ArrayList<String>();
		stList.add("Senthil");
		stList.add("Kumar");
		wildCardUnbound(stList);
		
		//Collection<?> wildOb = new ArrayList<String>();
		//wildOb.add("String");
		
		wild(intList);
		wild(stList);
		*/
		
		
		
	}
}
