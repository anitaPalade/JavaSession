package threadTesting;

public class DirectRunMethod extends Thread {

	public void run(){  
	  for(int i=1;i<4;i++){  
	    try{
	    	Thread.sleep(500);
	    }catch(InterruptedException e){
	    	System.out.println(e);
	    }  
	    System.out.println(i);  
	  } 
	  System.out.println("Loop completed\n");  
	 }  
	 public static void main(String args[]){  
		 DirectRunMethod t1=new DirectRunMethod();  
		 DirectRunMethod t2=new DirectRunMethod();  
		 t1.start();
		 t2.start();
//		 s
	 }  
}

/*
 * As you can see in the above program that there is no context-switching
 *  because here t1 and t2 will be treated as normal object not thread object
 */
