package com.controlStatement;

public class If_elseUse {  
  public static void main(String[] args) {  
    //defining an 'age' variable  
    int age=90; 
    //checking the age  
    if(age>18){  
        System.out.print("Age is greater than 18");  
    } 
    System.out.println("\nOutside of if statement!");
    
    //Check if the age is divisible by 2 or not  
    if(age%2==0){  
        System.out.println("\nAge is a even number");  
    }else{  
        System.out.println("\nAge is a odd number");  
    }  
  }  
} 