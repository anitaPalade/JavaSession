package threadTesting;

public class TestingYield extends Thread  
	{  
	    public void run()  
	    {  
	        for (int i=0; i<3 ; i++)  
	            System.out.println(Thread.currentThread().getName() + " in control");  
	    }  
	    public static void main(String[]args)  
	    {  
	    	TestingYield t1 = new TestingYield();  
	    	TestingYield t2 = new TestingYield();  
	        // this will call run() method  
	        t1.start();  
	        t2.start();  
	        for (int i=0; i<3; i++)  
	        {  
	            // Control passes to child thread  
	            t1.yield();  
	            System.out.println(Thread.currentThread().getName() + " in control");  
	        }  
	    }  
	} 
