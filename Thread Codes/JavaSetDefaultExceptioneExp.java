package threadTesting;

/*
 * The setDefaultUncaughtExceptionHandler() method of thread class sets the default handler invoked when a thread abruptly
 *  terminates due to an uncaught exception, and no other handler has been defined for that thread.
 */

public class JavaSetDefaultExceptioneExp implements Runnable   
{  
    public void run()   
    {  
      throw new RuntimeException();  
    }  
    public static void main(String[] args)   
    {  
        Thread thread = new Thread(new JavaSetDefaultExceptioneExp());  
        Thread.setDefaultUncaughtExceptionHandler(new Thread.  
        UncaughtExceptionHandler()   
        {  
            public void uncaughtException(Thread thread, Throwable e)   
            {  
                System.out.println("Exception caught: " + e);  
            }  
        });  
        // call run() function  
        thread.start();  
   }  
}
