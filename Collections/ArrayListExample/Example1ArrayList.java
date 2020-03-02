package ArrayListExample;

import java.util.*;
public class Example1ArrayList {
	
	   public static void main(String args[]) {
	      /* Creating ArrayList of type "String" which means
	       * we can only add "String" elements
	       */
	      ArrayList<String> al1 = new ArrayList<String>();

	      /*This is how we add elements to an ArrayList*/
	      al1.add("Tony");
	      al1.add("Larry");
	      al1.add("Joey");
	      al1.add("Garry");
	      al1.add("Terry");

	      // Displaying elements
	      System.out.println("Original ArrayList:");
	      for(String str:al1)
	         System.out.println(str);

	      try{
           /* Add element at the given index
	       */
	    	  al1.add(0, "Perry");
	    	  al1.add(1, "Mary");
          }catch(Exception e){
                System.out.println(e);  
          }
	      
	      // Displaying elements
	      System.out.println("ArrayList after add operation:");
	      for(String str:al1)
	         System.out.println(str);

          try{
              //Remove elements from ArrayList like this
              al1.remove("Perry"); 
              al1.remove("Terry"); 
          }catch(Exception e){
               System.out.println(e);
           }
	      // Displaying elements
	      System.out.println("ArrayList after remove operation:");
	      for(String str:al1)
	         System.out.println(str);

           try{
                //Remove element from the specified index
	            al1.remove(1); //Removes Second element from the List
           }catch(Exception e){
               System.out.println(e);
           }
	      

	      // Displaying elements
	      System.out.println("Final ArrayList:");
	      for(String str:al1)
	         System.out.println(str);
	   }
}
