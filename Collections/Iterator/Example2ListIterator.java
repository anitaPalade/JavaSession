package Iterator;

/*
 * ListIterator:
 * It is only applicable for List collection implemented classes like arraylist, linkedlist etc. It provides bi-directional iteration.
 * ListIterator must be used when we want to enumerate elements of List. This cursor has more functionality(methods) than iterator.
*/
 
import java.util.ArrayList; 
import java.util.ListIterator; 

public class Example2ListIterator {
		public static void main(String[] args) 
		{ 
			ArrayList<Integer> al = new ArrayList<Integer>(); 
			for (int i = 0; i < 10; i++) 
				al.add(i); 

			System.out.println("before " +al); 

			/* at beginning ltr(cursor) will point to index just before the first element in al */
			ListIterator<Integer> ltr = al.listIterator(); 

			// checking the next element availabilty 
			while (ltr.hasNext()) 
			{ 
				// moving cursor to next element 
				int i = (Integer)ltr.next(); 

				// getting even elements one by one 
				System.out.print(i + " "); 

				// Changing even numbers to odd and adding modified number again in iterator
				try {
					if (i%2==0) 
					{ 
						i++; // Change to odd 
						ltr.set(i); // set method to change value 
						ltr.add(i); // to add 
					} 
				}catch(Exception e) {
					System.out.println(e);
				}
			} 
			System.out.println(); 
			System.out.println("After modification: "+ al); 
		} 
}

/*
 * Limitations of ListIterator : It is the most powerful iterator but it is only applicable for List implemented classes,
 *  so it is not a universal iterator.
*/