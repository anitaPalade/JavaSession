// example where exception occurs and handled.
public class FinallyExample {
	
		  public static void main(String args[]){  
			  try { 
		            String a = "How's the Josh"; // length is 15
		            char c = a.charAt(20); // accessing 20th element 
		            System.out.println(c); 
		        } 
		        catch(StringIndexOutOfBoundsException e) { 
		            System.out.println("StringIndexOutOfBoundsException"); 
		        }  
		  finally
		  {
			  System.out.println("finally block is always executed");
			  }  
		  System.out.println("rest of the code...");  
		  }  
		
}
