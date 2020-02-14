package threadTesting;

/*
 * public void setDaemon(boolean status) =>	is used to mark the current thread as daemon thread or user thread.
 * 	public boolean isDaemon() => is used to check that current is daemon.
 */


public class TestingDaemonThread extends Thread{  
	public void run(){  
	  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
	  } else {  
		  System.out.println("user thread work");  
	  }  
	}  
	public static void main(String[] args){  
		TestingDaemonThread t1=new TestingDaemonThread();//creating thread  
		TestingDaemonThread t2=new TestingDaemonThread();  
		TestingDaemonThread t3=new TestingDaemonThread();  
		  
		t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
	}  
}

//The JVM exits when all the running threads are daemon threads. So like showing ads in a game


//REaL TIME EXAMPLE?
