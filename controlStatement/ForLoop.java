package com.controlStatement;

public class ForLoop {  
	public static void main(String[] args) {  
	    //Code of Simple for loop  
	    for(int number=1;number<=5;number++){  
	        System.out.println(number);  
	    } 
	    System.out.println("\n");
	    
	    //Nested for loop
	    System.out.println("Output of nested for:");
	    for(int row=1;row<=5;row++){  
			for(int column=1;column<=row;column++){  
			    System.out.print(" * ");  
			}  
			System.out.println();//new line  
		}  
	    //for-each loop  
	    System.out.println("Output of for-Each:");
	    int array[]={12,23,44,56,78};  
	    for(int index:array){  
	        System.out.println(index);  
	    }  
	    //labeled for loop
	    System.out.println("Output of labeled for loop:");
	    loop1:  
	        for(int number1=1;number1<=3;number1++){  
	            loop2:  
	                for(int number2=1;number2<=3;number2++){  
	                    if(number1==2&&number2==2){  
	                        break loop1;  
	                    }  
	                    System.out.println(number1+" "+number2);  
	                }  
	         }  
	    
	}  
}  