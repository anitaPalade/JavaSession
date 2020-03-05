package ListExamples;

import java.util.*;
//OPERATIONS ON LIST INTERFACE
public class Example1 {
	
		public static void main(String[] args) 
		{ 
			/*Creating a list 
			*void add(int index, Object O): This method adds given element at specified index.
			*/
			List<Integer> l1 = new ArrayList<Integer>(); 
			l1.add(0, 1); // adds 1 at 0 index 
			l1.add(1, 2); // adds 2 at 1 index 
			System.out.println(l1); // [1, 2] 
			

			// Creating another list 
			List<Integer> l2 = new ArrayList<Integer>(); 
			l2.add(1); 
			l2.add(2); 
			l2.add(3); 

			// Will add list l2 from 1 index 
			l1.addAll(1, l2); 
			System.out.println(l1); 

			/* Removes element from index 1 
			*Object remove(int index): This method removes an element from the specified index. 
			*It shifts subsequent elements(if any) to left and decreases their indexes by 1.
			*/
			
			
			l1.remove(1); 
			System.out.println(l1); // [1, 2, 3, 2] 

			/*
			 * Object get(int index): This method returns element at the specified index.
			 *Prints element at index 3 
			 */
			System.out.println(l1.get(3)); 

			/* Replace 0th element with 5 
			*Object set(int index, Object new): This method replaces element at given index with new element. 
			*This function returns the element which was just replaced by new element.
			*/
			l1.set(0, 5); 
			System.out.println(l1); 
		} 

}
