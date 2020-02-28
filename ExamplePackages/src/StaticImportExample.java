

import static java.lang.Math.*; // import 'Math' class

public class StaticImportExample {

   public static void main(String args[]) {
	   
	  double value = 4;
	  
      double sqroot = sqrt(value);   // Access sqrt() method using classname Math
      
      System.out.println("Square root of " + value + " is " + sqroot);
   
}
}


//import static java.lang.Math.*; // static import
//
//public class StaticImportExample {
//	
//   public static void main(String args[]) {
//	   
//      double value = 64;
//      
//      double sqroot = sqrt(value); // Access sqrt() method directly
//      
//      System.out.println("Sq. root of " + value + " is " + sqroot);
//   }
//}