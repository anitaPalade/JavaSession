package threadTesting;

public class TestingGarbageCollector {
	 public void finalize(){
		 System.out.println("object is garbage collected");
		 }  
	 
	 public static void main(String args[])  {
		 TestingGarbageCollector s1=new TestingGarbageCollector();  
		 TestingGarbageCollector s2=new TestingGarbageCollector();  
		 s1=null;  
		 s2=null;  
		 
		 System.gc();  
	 }
}


/*
 * The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing.
 * The Garbage collector of JVM collects only those objects that are created by new keyword. So if you have created any object without new
 * you can use finalize method to perform cleanup processing (destroying remaining objects).
 */
