package threadTesting;

public class UsingThreadClass extends Thread{
	
	//OVERRIDDING THE RUN() METHOD BECAUSE THREAD CLASS WAS EXTENDED
	public void run(){  
		System.out.println("thread is created using class....");  
		System.out.println(Thread.currentThread().getName()); 
	}  
	public static void main(String args[]){  
		UsingThreadClass thread1= new UsingThreadClass();
		//CANNOT START 1 THREAD MULTIPLE TIMES
		thread1.start();
//		thread1.start();
	}  
}
