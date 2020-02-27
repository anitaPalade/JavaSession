package com.controlStatement;

public class Continue_InWhile {  
public static void main(String[] args) {  
    //while loop  
    int number=1;  
    while(number<=10){  
        if(number==5){  
            //using continue statement  
        	number++;  
            continue;//it will skip the rest statement  
        }  
        System.out.println(number);  
        number++;  
    }  
  }  
}  