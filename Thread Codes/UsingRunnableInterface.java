package threadTesting;


/*CONSTRUCTORS THAT ARE USED
 * Thread()
 * Thread(String name)
 * Thread(Runnable r)
 * Thread(Runnable r,String name) 
*/

public class UsingRunnableInterface implements Runnable {

	//IMPLEMENTING THE RUN METHOD //
	public void run() {
		System.out.println("thread has been created using interface...\n"); 
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String args[]){  
		UsingRunnableInterface run1=new UsingRunnableInterface();  
		Thread thread1 =new Thread(run1,"bhaiKiThread");
		//EXPLICITLY USING THREAD CLASS TO CREATE THREADS   
		thread1.start()	;


	} 
	
}
