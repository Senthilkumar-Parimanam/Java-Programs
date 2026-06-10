package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
	
	private T a;
	private T b;
	
	GenericClass(T a, T b){
		this.a = a;
		this.b = b;
	}
	
	public T print(T a,T b){
		List<T> list = new ArrayList();
		list.add(a);
		list.add(b);
		System.out.println(" Result is "+ list.get(0));
		System.out.println(" Result is "+ list.get(1));
		return a;
	}
	
	public void print(){
	
		System.out.println(" a is "+ a);
		System.out.println(" b is "+ b );
		
	}
	
	public static void main(String arg[]){
		GenericClass<Integer> ob = new GenericClass<Integer>(10,20);
		ob.print(20,30);
	}
	
}


class UpperBound<T extends Number>{
	T a;
	UpperBound(T a){
		this.a = a;
	}
	
	
}

/*// Generic Type cant be created ? extends Number
class GenericsWithQuestionMark<? extends Number> {

}*/



// Lower bound is not possible in Type Parameter
/*class LowerBound<T super Number>{
	T a;
	LowerBound(T a){
		this.a = a;
	}
}*/

/*
//Generic type cant be created with wild card 
class Wildcard<?>{
	
}*/





