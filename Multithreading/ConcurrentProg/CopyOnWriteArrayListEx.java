package Multithreading.ConcurrentProg;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx implements Callable<String>{
	
	@Override
	public String call() throws Exception {

		return null;
	}
	
	
	
	public static void main(String[] arg) {
		
		List<String> ex = new ArrayList();
		ex.add("Senthil");
		ex.add("kumar");
		ex.add("saravana");
		ex.add("Ashok");
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(ex);
		
		
		for(String st:list) {
			System.out.println(st);
		}
	}

	

}
