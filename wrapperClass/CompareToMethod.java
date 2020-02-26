package wrapperClass;

public class CompareToMethod 
{ 
    public static void main(String[] args)  
    { 
        // creating an Integer Class object with value "10" 
        Integer i = new Integer("10"); 
  
        // comparing value of i 
        System.out.println(i.compareTo(7));  
        System.out.println(i.compareTo(11));  
        System.out.println(i.compareTo(10));  
    } 
} 