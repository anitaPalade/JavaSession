package Iterator;

/*
 * Iterator:
 * It is a universal iterator as we can apply it to any Collection object.
 *  By using Iterator, we can perform both read and remove operations.
 *   It is improved version of Enumeration with additional functionality of remove-ability of a element.
 */

import java.util.ArrayList; 
import java.util.Iterator; 

public class Example1Iterator {
		public static void main(String[] args) 
		{ 
			ArrayList<Integer> al = new ArrayList<Integer>(); 

			for (int i = 0; i < 10; i++) 
				al.add(i); 

			System.out.println(al); 

			// at beginning itr(cursor) will point to 
			// index just before the first element in al 
			Iterator<Integer> itr = al.iterator(); 

			// checking the next element availabilty 
			while (itr.hasNext()) 
			{ 
				// moving cursor to next element 
				int i = (Integer)itr.next(); 

				// getting even elements one by one 
				System.out.print(i + " "); 

				// Removing odd elements
				try {
					/*
					 * remove() method can throw two exceptions
					 * UnsupportedOperationException : If the remove operation is not supported by this iterator
					 * IllegalStateException : If the next method has not yet been called, or the remove method has already
					 *  been called after the last call to the next method
					 */
					
					if (i % 2 != 0) 
						itr.remove(); 
					
				}catch(Exception e) {
					System.out.println(e);
				}
			} 
				System.out.println(); 
				System.out.println(al); 
		}  
}

/*
 * Limitations of Iterator :
 * Only forward direction iterating is possible.
 * Replacement and addition of new element is not supported by Iterator.
 */

