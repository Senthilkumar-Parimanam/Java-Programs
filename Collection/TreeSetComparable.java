package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetComparable {

	public static void main(String arg[]){
		
		TreeSet<Person> tree = new TreeSet();
		tree.add(new Person("Senthil",10000));
		tree.add(new Person("Kumar",100000));
		Iterator<Person> it = tree.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getNo());
		}
		
	}
	
}



class Person implements Comparable{
	
	String name;
	int no;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	
	
	Person(String name, int no){
		this.name = name;
		this.no = no;
	}

	@Override
	public int compareTo(Object ob) {
		Person arg = (Person) ob;
		if(this.no == arg.no)
			return 0;
		else if(this.no > arg.no)
			return 10;
		else 
			return -10;
			
		
		
		
	}
	
	
	
}