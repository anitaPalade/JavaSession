package LinkedListExamples;

import java.util.*;

public class Example3LinkedList {
	public static void  main(String[] args) {
	     LinkedList<String> carsList =new LinkedList<String>();

	     //Adding elements to the Linked list
	     carsList.add("Maruti");
	     carsList.add("Tata");
	     
	     Collection<String> collect = new ArrayList<String>(); 
	      collect.add("Ford"); 
	      collect.add("Nissan");  
	     
	     try {
	    	 carsList.add(3,"renault" );// add(int index, obj)
	     }catch(IndexOutOfBoundsException e){
	    	 System.out.println(e);
	    	 System.out.println();
	     }
	     
	     try {
	    	 carsList.addAll(6,collect);// addAll(int index, object)
	     }catch(IndexOutOfBoundsException e){
	    	 System.out.println(e);
	    	 System.out.println();
	     }
	     
	     System.out.println("Before adding at first and last");
	     for(String tempString: carsList)
	    	 System.out.println(tempString);
	     
	     
	     carsList.addFirst("Ambassador");
	     carsList.addLast("Contessa");
	     
	     System.out.println("\nAfter adding at first and last");
	     for(String tempString: carsList)
	    	 System.out.println(tempString);
	     
	     carsList.clear();
	     carsList.add("Toyota");
	     
	     System.out.println("\nAfter Clearing");
	     for(String tempString: carsList)
	    	 System.out.println(tempString);
	     
	     System.out.println("\n"+ carsList.contains("Toyota")+"\n");
	     
	     try {
	    	 carsList.get(12);
	     }catch(Exception e){
	    	 System.out.println(e);
	    	 System.out.println();
	     }
	     
	     System.out.println("\n"+ carsList.pop()+"\n");
	     try {
	    	 System.out.println("\n"+ carsList.pop()+"\n");//pop()
	     }catch(Exception e) {
	    	 System.out.println(e);
	    	 System.out.println();
	     }
	     
	     carsList.push("Ferrari");
	     carsList.push("BMW");
	     carsList.push("Dogde");
	     carsList.push("Corvette");
	     carsList.push("Laxus");
	     
	     for(String tempString: carsList)
	    	 System.out.println(tempString);
	     
	     carsList.remove();
	     
	     	System.out.println();
	     for(String tempString: carsList)
	    	 System.out.println(tempString);
	     
	     try {
	    	 carsList.remove(9);
	     }catch(Exception e){
	    	 System.out.println();
	    	 System.out.println(e);
	     }
	     
	     	System.out.println("\nAfter removing with index\n");
	     for(String tempString: carsList)
	    	 System.out.println(tempString);
	     
	     try {
	    	 carsList.set(3, "Subaru");
	     }catch(Exception e) {
	    	 System.out.println();
	    	 System.out.println(e);
	     }
	     
	     System.out.println("\nAfter setting with index\n");
	     for(String tempString: carsList)
	    	 System.out.println(tempString);
	     
	     
	     System.out.println("\n size() method"+carsList.size());
	     ListIterator<String> itr = null ;
	     try {
	    	 itr = carsList.listIterator(2);
	     }catch(Exception e) {
	    	 System.out.println();
	    	 System.out.println(e);
	     }
	     
//	     itr = carsList.listIterator();
	     
	     System.out.println("\nUsing iterator");
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
	     
	     
	}
}
