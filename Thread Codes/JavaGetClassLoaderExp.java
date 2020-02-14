package threadTesting;

//The getContextClassLoader() method of thread class returns the context ClassLoader for the thread.

public class JavaGetClassLoaderExp implements Runnable   
{  
    public void run()   
    {  
        System.out.println("Thread is running");  
    }  
    public static void main(String args[])  
    {  
        JavaGetClassLoaderExp g1 = new JavaGetClassLoaderExp();  
        Thread t1 = new Thread(g1);  
        // call run() method  
        t1.start();  
          
        // returns the context ClassLoader for thread t1  
        ClassLoader loader = t1.getContextClassLoader();  
        // sets the context ClassLoader for thread t1   
        t1.setContextClassLoader(loader);  
        System.out.println("Context ClassLoader = " + loader);  
        System.out.println("Parent = " + loader.getParent());  
        System.out.println("Class = " + loader.getClass());  
    }  
} 

