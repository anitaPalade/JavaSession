package threadTesting;

/*Performing tasks before jvm shuts down is done in shutdownhook. Used with the runtime class as runtime provides current environment values.
public void addShutdownHook(Thread hook){} 
*called with runtimeObject.addShutdownHook(Thread hook)
*To get current runtime environment ----Runtime r=Runtime.getRuntime();-------
*/

class MyThread extends Thread{  
    public void run(){  
        System.out.println("shut down hook task completed..");  
    }  
}  

public class ShutDownHook {

	public static void main(String[] args)throws Exception {  
		  
		Runtime r=Runtime.getRuntime();  
		r.addShutdownHook(new MyThread());  //new thread is created
		
		System.out.println(r.freeMemory());
		
		System.out.println(r.maxMemory());
		
		
		System.exit(1);
		      
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		try{
			Thread.sleep(3000);
			}catch (Exception e) {
				System.out.println(e);
			}  
		
	}
		
}

