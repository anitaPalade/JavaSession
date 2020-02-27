package threadTesting;

public class TestingThreadSleep extends Thread{
	
	public void run(){  
		for(int i=1;i<5;i++){  
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}  
			System.out.println(Thread.currentThread().getName());
	  }  
	 }
	
	 public static void main(String args[]){  
	  TestingThreadSleep t1=new TestingThreadSleep();  
	  TestingThreadSleep t2=new TestingThreadSleep();  
	  
	  t1.start();  
	  t2.start();  
	 } 
}