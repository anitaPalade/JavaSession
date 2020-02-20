
public class NestedTryExample {
	public static void main(String args[]){  
		  try{ 
			  
			  try{  
				 System.out.println("going to divide");  
				 int b =39/0;  
			  	}
			  	catch(ArithmeticException e)
			  	{
			  		System.out.println(e);
			  		//System.out.println(e.getMessage());
			  	}  
		   
			  try { 
	            String a = null; //null value 
	            System.out.println(a.charAt(0)); 
			  	} 
			  catch(NullPointerException e)
			  { 
	            System.out.println("NullPointerException.."); 
			  } 
		  }
		  catch(Exception e)
		  {
			  System.out.println("handeled");
		  }  
		  
		  System.out.println("normal flow..");  
		}  
}
