package wrapperClass;

public class IntegerParseMethod 
{ 
    public static void main(String[] args) 
    { 
        // parsing different strings 
        int value1 = Integer.parseInt("654",8);  
        int value2 = Integer.parseInt("-FF", 16); 
        long value3 = Long.parseLong("2158611234",10);  
              
        System.out.println(value1); 
        System.out.println(value2); 
        System.out.println(value3); 
              
        // run-time NumberFormatException will occur here 
        // "Geeks" is not a parsable string 
        int value4 = Integer.parseInt("Perficient",8);  
              
        // run-time NumberFormatException will occur here 
        // (for octal(8),allowed digits are [0-7]) 
        int value5 = Integer.parseInt("99",8);
        
        
//        // parsing different strings 
//        int value6 = Integer.parseInt("654");  
//        int value7 = Integer.parseInt("-08766"); 
//        long value8 = Long.parseLong("2158611234");  
//              
//        System.out.println(value6); 
//        System.out.println(value7); 
//        System.out.println(value8); 
//              
//        // run-time NumberFormatException will occur here 
//        // "Geeks" is not a parsable string 
//        int value9 = Integer.parseInt("Perficient");  
//              
//        // run-time NumberFormatException will occur here 
//        // (for octal(8),allowed digits are [0-7]) 
//        int value10 = Integer.parseInt("FF");
    } 
} 