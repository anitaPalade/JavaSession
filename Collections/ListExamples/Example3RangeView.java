package ListExamples;

import java.util.*; 

public class Example3RangeView {
	/*
	 * Java program to demonstrate subList operation on List interface. 
	 */
		public static void main(String[] args) 
		{ 
			// Type safe array list, stores only string 
			List<String> l = new ArrayList<String>(5); 

			l.add("Gold"); 
			l.add("Silver"); 
			l.add("Bronze"); 
			l.add("Aluminium"); 
			l.add("Iron"); 

			List<String> range = new ArrayList<String>(); 
			
			/*
			 * List subList(int fromIndex, int toIndex):This method returns List view of specified List between fromIndex(inclusive)
			 *  and toIndex(exclusive).
			 */
			
			range = l.subList(2, 4); 

			System.out.println(range); 
		} 
}
