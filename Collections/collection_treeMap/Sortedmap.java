package collection_treeMap;

import java.util.*;

class Sortedmap {
	public static void main(String args[]) {
		SortedMap<Integer, String> sortedMap = new TreeMap<Integer, String>();
		sortedMap.put(1, "Anita");
		sortedMap.put(2, "Avanti");
		sortedMap.put(4, "Anurag");
		sortedMap.put(3, "Prajakta");
		sortedMap.put(5, "Rajeev");
		sortedMap.put(6, "Raj");
		System.out.println(sortedMap);
		// Returns key-value pairs whose keys are less than or equal to the specified
		// key.
		System.out.println("HeadMap: " + sortedMap.headMap(1));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("TailMap: " + sortedMap.tailMap(4));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + sortedMap.subMap(3, 5));
		
		System.out.println("First Key :" +sortedMap.firstKey());
		System.out.println("First Key :" +sortedMap.lastKey());
	}
}