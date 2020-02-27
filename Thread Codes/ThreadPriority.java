package threadTesting;

public class ThreadPriority extends Thread{  
	public void run(){  
//		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());  
	}  
	public static void main(String args[]){  
		ThreadPriority t1=new ThreadPriority();  
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		ThreadPriority t4=new ThreadPriority();
		  t1.setPriority(Thread.MIN_PRIORITY);  
		  t2.setPriority(Thread.MAX_PRIORITY);
		  t3.setPriority(8);
		  t4.setPriority(3);
		  t1.start();
		  t1.setName("Thread 1 h ye");
		  t2.start();
		  t2.setName("Thread 2 h ye");
		  t3.start();
		  t3.setName("Thread 3 h ye");
		  t4.start();
		  t4.setName("Thread 4 h ye");
	}  
}
