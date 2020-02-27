
class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  

public class CustomExceptionExample {
	 
		  	static void validate(int age)throws Exception{  
		    if(age<18)  
		    throw new InvalidAgeException("not valid");  
		    else  
		    System.out.println("welcome to vote");  
		  	}  
		     
		  	public static void main(String args[])
		  	{  
		    try{  
		    validate(13);  
		    }
		    catch(Exception m)
		    {System.out.println("Exception occured: "+m);
		    }  
		    System.out.println("rest of the code...");  
		  	}  
		  
}
