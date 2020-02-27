package threadTesting;

public class JavaetDefaultExceptioneExp implements Runnable   
{  
    public void run()   
    {  
        // prints thread name  
        System.out.println("Currently running thread is: " + Thread.currentThread().getName());  
    }  
    public static void main(String[] args)   
    {  
        JavaetDefaultExceptioneExp g1 = new JavaetDefaultExceptioneExp();  
        Thread t1 = new Thread(g1);  
        Thread t2 = new Thread(g1);  
        // this will call run() function  
        t1.start();  
        t2.start();  
          
        // returns the default handler  
        Thread.UncaughtExceptionHandler handler = Thread.getDefaultUncaughtExceptionHandler();  
        System.out.println(handler);  
    }  
}
