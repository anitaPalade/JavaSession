package com.access.modifiers;

public class Modifier2 {
		public void message(){
			System.out.println("Here is public method");
		}  
}  

class Modifier22 { 
	  public static void main(String args[]){
	   System.out.println("Accessing public method in same package");
	   Modifier2 obj = new Modifier2();  
	   obj.message();  
	  }  
}  