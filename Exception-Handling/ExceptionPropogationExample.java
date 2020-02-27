
public class ExceptionPropogationExample {  
		  void FirstMethod()
		  {  
		    int data=50/0;  
		  }  
		  void SecondMethod()
		  {  
		    FirstMethod();  
		  }  
		  void ThirdMethod()
		  {  
			  try{  
				  SecondMethod();  
		   		}
			  catch(ArithmeticException e)
		   		{
				  System.out.println(e);
		   		}  
		  }  
		  public static void main(String args[]){  
		  ExceptionPropogationExample obj=new ExceptionPropogationExample();  
		  obj.ThirdMethod();  
		  System.out.println("normal flow...");  
	} 	
}
