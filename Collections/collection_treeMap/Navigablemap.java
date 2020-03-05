package collection_treeMap;

import java.util.*;

class Navigablemap {
	public static void main(String args[]) {
		NavigableMap<Integer, String> navigableMap = new TreeMap<Integer, String>();
		navigableMap.put(1, "Anita");
		navigableMap.put(2, "Avanti");
		navigableMap.put(4, "Anurag");
		navigableMap.put(3, "Prajakta");
		navigableMap.put(5, "Rajeev");
		System.out.println(navigableMap);
		// Maintains descending order
		System.out.println("\nDescendingMap: " + navigableMap.descendingMap());
		// Returns key-value pairs whose keys are less than or equal to the specified
		// key.
		System.out.println("\nHeadMap: " + navigableMap.headMap(4, true));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("\nTailMap: " + navigableMap.tailMap(4, true));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("\nsubMap: " + navigableMap.subMap(3, true, 5, false));

		System.out.printf("\nFloor Entry  :" +navigableMap.floorEntry(3));
		System.out.printf("\nFirst Entry  : " +navigableMap.firstEntry());
		System.out.printf("\nLast Key : " +navigableMap.lastKey());
		System.out.printf("\nFirst Key : " +navigableMap.firstKey());
	}
}