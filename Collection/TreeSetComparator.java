package Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetComparator {
	
	public static void main(String arg[]){
		TreeSet<Employee> tree = new TreeSet(new CompTest() );
		tree.add(new Employee("Senthil",100,"Manager", 10000));
		tree.add(new Employee("kumar",200, "Employee", 1000));
		Iterator<Employee> it = tree.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getEmpNumber());
		}
		
	}

}





class CompTest implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Employee ob1 = (Employee) o1;
		Employee ob2 = (Employee) o2;
		if(ob1.getEmpNumber() == ob2.getEmpNumber())
			return 0;
		else if(ob1.getEmpNumber() > ob2.getEmpNumber())
			return 1;
		else 
			return -1;
	}
}