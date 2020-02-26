package wrapperClass;

public class LongClassMethods2  
{ 
    public static void main(String args[])  
    { 
        long b = 55; 
        String bb = "45"; 
  
        // Construct two Long objects 
        Long x = new Long(b); 
        Long y = new Long(bb); 
  
        // xxxValue can be used to retrieve 
        // xxx type value from long value. 
        // xxx can be int,byte,short,long,double,float 
        System.out.println("bytevalue(x) = " + x.byteValue()); 
        System.out.println("shortvalue(x) = " + x.shortValue()); 
        System.out.println("intvalue(x) = " + x.intValue()); 
        System.out.println("longvalue(x) = " + x.longValue()); 
        System.out.println("doublevalue(x) = " + x.doubleValue()); 
        System.out.println("floatvalue(x) = " + x.floatValue()); 
          
        long value = 45; 
          
        // bitcount() : can be used to count set bits 
        // in twos complement form of the number 
        System.out.println("Long.bitcount(value)=" + Long.bitCount(value)); 
          
        // numberOfTrailingZeroes and numberOfLeaadingZeroes 
        // can be used to count prefix and postfix sequence of 0 
        System.out.println("Long.numberOfTrailingZeros(value)=" +  
                             Long.numberOfTrailingZeros(value)); 
        System.out.println("Long.numberOfLeadingZeros(value)=" +  
                             Long.numberOfLeadingZeros(value)); 
          
        // highestOneBit returns a value with one on highest  
        // set bit position 
        System.out.println("Long.highestOneBit(value)=" +  
                                   Long.highestOneBit(value)); 
          
        // highestOneBit returns a value with one on lowest  
        // set bit position 
        System.out.println("Long.lowestOneBit(value)=" +  
                                   Long.lowestOneBit(value)); 
          
        // reverse() can be used to reverse order of bits 
        // reverseytes() can be used to reverse order of bytes 
        System.out.println("Long.reverse(value)=" + Long.reverse(value)); 
        System.out.println("Long.reverseBytes(value)=" + 
                                    Long.reverseBytes(value)); 
          
        // signum() returns -1,0,1 for negative,0 and positive  
        // values 
        System.out.println("Long.signum(value)=" + Long.signum(value)); 
      
        // hashcode() returns hashcode of the object 
        int hash = x.hashCode(); 
        System.out.println("hashcode(x) = " + hash); 
  
        // equals returns boolean value representing equality 
        boolean eq = x.equals(y); 
        System.out.println("x.equals(y) = " + eq); 
  
        // compare() used for comparing two int values 
        int e = Long.compare(x, y); 
        System.out.println("compare(x,y) = " + e); 
  
        // compareTo() used for comparing this value with some 
        // other value 
        int f = x.compareTo(y); 
        System.out.println("x.compareTo(y) = " + f); 
   } 
} 