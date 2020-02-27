package threadTesting;

public class TestingIsAlive extends Thread   
	{  
	    public void run()  
	    {  
	        try   
	        {  
	            Thread.sleep(300);  
	            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  
	        }  
	        catch (InterruptedException ie) {  
	        }  
	    }  
	    public static void main(String[] args)  
	    {  
	    	TestingIsAlive t1 = new TestingIsAlive();  
	        System.out.println("before starting thread isAlive: "+t1.isAlive());  
	        t1.start();  
	        System.out.println("after starting thread isAlive: "+t1.isAlive());  
	    }  

}
