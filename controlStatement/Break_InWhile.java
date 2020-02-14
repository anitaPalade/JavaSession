package com.controlStatement;

public class Break_InWhile {  
	public static void main(String[] args) {  
	    //while loop  
	    int number=1;  
	    while(number<=10){  
	        if(number==5){  
	            //using break statement  
	            number++;  
	            break;//it will break the loop  
	        }  
	        System.out.println(number);  
	        number++;  
	    }  
	}  
}  