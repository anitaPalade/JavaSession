package threadTesting;

public class TestingSuspend extends Thread  
	{    
	    public void run()  
	    {    
	        for(int i=1; i<5; i++)  
	        {    
	            try  
	            {  
	                // thread to sleep for 500 milliseconds  
	                 sleep(500);  
	                 System.out.println(Thread.currentThread().getName());    
	            }catch(InterruptedException e){System.out.println(e);}    
	            System.out.println(i);    
	        }    
	    }    
	    public static void main(String args[])  
	    {    
	        // creating three threads   
	    	TestingSuspend t1=new TestingSuspend ();    
	    	TestingSuspend t2=new TestingSuspend ();   
	    	TestingSuspend t3=new TestingSuspend ();   
	        // call run() method   
	        t1.start();  
	        t2.start();  
	        // suspend t2 thread   
	       //  t2.suspend();   deprecated
	        // call run() method   
	        t3.start();  
	    }    
	}  
