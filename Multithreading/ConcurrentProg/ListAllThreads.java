package Multithreading.ConcurrentProg;

import java.util.Iterator;
import java.util.Set;

public class ListAllThreads {
	
	public static void main(String[] arg) {
		
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		Iterator iterator = threadSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
			
			
		}
		
		
	}

}
