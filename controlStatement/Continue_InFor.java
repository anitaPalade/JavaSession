package com.controlStatement;

public class Continue_InFor {  
	public static void main(String[] args) {  
		 for(int number1=1;number1<=3;number1++){     
			 for(int number2=1;number2<=3;number2++){    
		         if(number1==2&&number2==2){    
		            System.out.println("After continue called");
                    //using continue statement inside inner loop  
		            continue;    
		         }    
	          System.out.println(number1+" "+number2);    
           }    
       }    
	}  
}