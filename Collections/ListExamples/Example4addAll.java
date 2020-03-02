package ListExamples;

/*
 * Syntax: boolean addAll(Collection c)
 * Parameters: This function has a single parameter, i.e, Collection c, whose elements are to be appended to the list.
 */
import java.util.*;
public class Example4addAll {

		// Driver code 
		public static void main(String[] args) 
		{ 

			// Initializing a list of type arraylist 
			List<Integer> list1 = new ArrayList<>(); 
			list1.add(10); 
			list1.add(15); 
			list1.add(20); 
			System.out.println("List1 contents " +list1); 

			// Initializing a collection to be appended to list 
			ArrayList<Integer> arr = new ArrayList<Integer>(); 
			arr.add(100); 
			arr.add(200); 
			arr.add(300); 
			System.out.println("ArrayList contents " + arr); 
			list1.addAll(arr); 
			System.out.println("List1 after addAll " + list1); 
		} 
}


