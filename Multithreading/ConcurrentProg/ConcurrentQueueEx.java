package Multithreading.ConcurrentProg;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueEx {
	
	
	public static void main(String[] arg) {
		
		ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
		queue.add("Senthil");
		queue.add("kumar");
		queue.add("saravana");
		queue.add("Ashok");
		
		int size = queue.size();
		
		
	}

}
