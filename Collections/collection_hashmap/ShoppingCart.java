package collection_hashmap;

import java.util.HashMap;
import java.util.Set;

public class ShoppingCart {

	public static void main(String a[]) {

		HashMap<String, Double> groceryItems = new HashMap<String, Double>();

		// add grocery Items to Shopping cart

		groceryItems.put("Tomatoes", 10.50);
		groceryItems.put("Onions", 4.50);
		groceryItems.put("Potatoes", 20.00);
		groceryItems.put("Oil", 7.00);
		System.out.println("\n" + groceryItems);

		// getting value for the given key from hashmap

		System.out.println("\nPrice of Onions: " + groceryItems.get("Onions"));
		System.out.println("\nIs HashMap empty? " + groceryItems.isEmpty());

		groceryItems.remove("Potatoes");

		System.out.println("\n" + groceryItems);
		System.out.println("\nSize of the HashMap: " + groceryItems.size());

		// Iterating through HashMap Items

		System.out.println("\nReterive Each Items Names from our Grocery List of Items \n");

		Set<String> groceryItemNames = groceryItems.keySet();
		for (String eachItem : groceryItemNames) {

			System.out.println(eachItem);

		}

		System.out.println("\nSearching Grocery List of Items keys or Names \n");

		if (groceryItems.containsKey("Oil")) {

			System.out.println("The shoppingCart contains key Canola Oil");

		} else {

			System.out.println("The shoppingCart does not contains key Canola Oil");
		}
		
		System.out.println("\nSearching Grocery List of Items keys or Names \n");
		if (groceryItems.containsValue(7.00)) {
			System.out.println("The shoppingCart contains Canola Oil of Value is 7.00");

		} else {

			System.out.println("The shoppingCart does not contains value of Canola Oil");

		}
	}
}
