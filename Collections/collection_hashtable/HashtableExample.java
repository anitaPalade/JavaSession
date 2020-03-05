package collection_hashtable;

import java.util.*;

class HashtableExample {
	public static void main(String args[]) {
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		String mapName = "{'name':'Shishir'}";
		hashtable.put(1, mapName);
		hashtable.put(2, "Avanti");
		hashtable.put(4, "Anurag");
		hashtable.put(3, "Prajakta");
		hashtable.put(5, "Rajeev");
		System.out.println(hashtable);

		for (Map.Entry m : hashtable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("\nBefore remove: " + hashtable);
		hashtable.remove(2);
		System.out.println("After remove: " + hashtable+ "\n");
		
		System.out.println(hashtable.getOrDefault(1, "Not Found"));  
	    System.out.println(hashtable.getOrDefault(6, "Not Found"));  
	    
	    hashtable.putIfAbsent(6,"Ankit");  
	    System.out.println("\nUpdated Map: "+hashtable);  
	     //Returns the current value, as the specified pair already exist  
	    hashtable.putIfAbsent(1,"Anita");  //it will not update as key is present and aslo not update the value
	     System.out.println("Updated Map: "+hashtable);  
	}
}