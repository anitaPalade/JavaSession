package threadTesting;

/*
public void join()throws InterruptedException
public void join(long milliseconds)throws InterruptedException
 */

public class TestingThreadJoin extends Thread {
	public void run(){  
		for(int i=1;i<4;i++){  

		   		System.out.println(Thread.currentThread().getName() + " is running");  
		  }  
	}  
	public static void main(String args[]){  
		TestingThreadJoin t1=new TestingThreadJoin();  
		TestingThreadJoin t2=new TestingThreadJoin();  
		TestingThreadJoin t3=new TestingThreadJoin();  
		
		t1.start();  
		  
		try{  
		  t1.join(1000);
		 }catch(Exception e){
			 System.out.println(e);
		}
		
		t3.start();
//		try{  
//			  t3.join(1000);
//			 }catch(Exception e){
//				 System.out.println(e);
//			}
		t2.start();  
	}
}
