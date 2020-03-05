package ListExamples;

import java.util.*; 
public class Example2Search {
	/*
	 * Java program to demonstrate search 
	 * operations on List interface 
	 */
		public static void main(String[] args) 
		{ 
			// Type safe array list, stores only string 
			List<String> list1 = new ArrayList<String>(5); 
			list1.add("lost"); 
			list1.add("in the "); 
			list1.add("world"); 
 
			/*
			 * Using indexOf() and lastIndexOf() 
			 * int indexOf(Object o): This method returns first occurrence of given element or -1 if element is not present in list
			 * int lastIndexOf(Object o): This method returns the last occurrence of given element or
			 *  -1 if element is not present in list.
			 */
			
			System.out.println("first index of Geeks: "+ list1.indexOf("lost")); 
			System.out.println("last index of Geeks: "+ list1.lastIndexOf("world")); 
			System.out.println("Index of element not present : "+ list1.indexOf("Hello")); 
		}  
}
