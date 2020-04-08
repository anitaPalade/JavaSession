package collection_treeMap;
import java.util.*;

class TreeMapExample {
	public static void main(String args[]) {

		TreeMap<Integer,String> treemap =new TreeMap<Integer,String>();   

		treemap.put(1, "Anita");
		treemap.put(2, "Avanti");
		treemap.put(4, "Anurag");
		treemap.put(3, "Prajakta");
		treemap.put(5, "Rajeev");

		for (Map.Entry m : treemap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		   
		// Fetching key
		System.out.println("\nKeys: " + treemap.keySet());
		// Fetching value
		System.out.println("Values: " + treemap.values());
		// Fetching key-value pair
		System.out.println("Key-Value pairs: " + treemap.entrySet());
		
		System.out.println("\nBefore invoking remove() method: "+treemap);     
		treemap.remove(2);  
	    System.out.println("After invoking remove() method: "+treemap);    
	}
}