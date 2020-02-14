package com.access.modifiers;

public class Modifier3 {
		protected void message(){
			System.out.println("Here is protected method");
		}  
}  

class Modifier33 { 
	  public static void main(String args[]){
	   System.out.println("Accessing protected method in same package class");
	   Modifier3 obj = new Modifier3();  
	   obj.message();  
	  }  
}  