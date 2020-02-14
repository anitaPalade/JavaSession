package objectClassTesting;

public class Finalize {
	public static void main(String[] args) 
    { 
        Finalize t = new Finalize(); 
        System.out.println(t.hashCode()); 
  
        t = null; 
  
        // calling garbage collector  
        System.gc(); 
  
        System.out.println("end"); 
    } 
  /*This method is called just before an object is garbage collected. 
   * It is called by the Garbage Collector on an object when garbage collector determines that there are no more references to the object.
   *  We should override finalize() method to dispose system resources, perform clean-up activities and minimize memory leaks.*/

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize method called"); 
	}
	
}
