package Generics;

import java.util.*;

public class GenericMethod {

	
	public static<T> void display(Collection<T> list){
		list.stream().filter(t -> t.toString().length()>1).forEach(t -> System.out.println(t));
	}
	
	public static void main(String arg[]){
		ArrayList<String> stList = new ArrayList<>();
		stList.add("hai");
		stList.add("hello");
		stList.add("");
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addAll(stList);
		TreeSet<String> treeSet = new TreeSet<>(stList);
		HashSet<String> hashSet = new HashSet<>(stList);

		System.out.println("ArrayList");
		display(stList);
		System.out.println("LinkedList");
		display(linkedList);
		System.out.println("TreeSet");
		display(treeSet);
		System.out.println("HashSet");
		display(hashSet);

	}
	
	
	
} 
