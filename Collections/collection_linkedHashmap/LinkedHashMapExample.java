package collection_linkedHashmap;

import java.util.*;

class LinkedHashMapExample {
	public static void main(String args[]) {

		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();

		linkedhashmap.put(1, "Anita");
		linkedhashmap.put(2, "Avanti");
		linkedhashmap.put(3, "Anurag");
		linkedhashmap.put(4, "Prajakta");
		linkedhashmap.put(5, "Rajeev");
		System.out.println(linkedhashmap);
		
		for (Map.Entry m : linkedhashmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Fetching key
		System.out.println("\nKeys: " + linkedhashmap.keySet());
		// Fetching value
		System.out.println("Values: " + linkedhashmap.values());
		// Fetching key-value pair
		System.out.println("Key-Value pairs: " + linkedhashmap.entrySet());
		
		System.out.println("\nBefore invoking remove() method: "+linkedhashmap);     
		linkedhashmap.remove(2);  
	    System.out.println("After invoking remove() method: "+linkedhashmap);    
	}
}