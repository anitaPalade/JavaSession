package threadTesting;

public class NamingThreads extends Thread {
	public void run(){  
		   System.out.println("\nRunning "+Thread.currentThread()); 
		   System.out.println("\n"+Thread.currentThread().getName()); 
		 }  
	// thread's name, priority, and thread group Thread[Thread-0,5,main]
		 public static void main(String args[]){   
			 NamingThreads t1=new NamingThreads();  
			 NamingThreads t2=new NamingThreads();
			
		  System.out.println("Name of t1:"+t1.getName());
		  System.out.println("ID of t1:"+t1.getId());
		  System.out.println("\nName of t2:"+t2.getName());  
		  System.out.println("ID of t2:"+t2.getId());
		  t1.setName("Rajeev THread");   
		  t1.start();
		  try{  
			  t1.join(1000);
			 }catch(Exception e){
				 System.out.println(e);
			}
		  t2.start();   
		 } 
}
