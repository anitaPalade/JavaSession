package objectClassTesting;

class CloneByAssignment{ 
	 int x, y; 
	 CloneByAssignment() { 
	        x = 10; 
	        y = 20; 
	    } 
}

/*Every class that implements clone() should call super.clone() to obtain the cloned object reference.
The class must also implement java.lang.Cloneable interface whose object clone we want to create otherwise
 it will throw CloneNotSupportedException when clone method is called on that class’s object.
   protected Object clone() throws CloneNotSupportedException */

// Contains a reference of Test and implements 
// clone with shallow copy. 
class Test2 implements Cloneable 
{ 
    int a; 
    int b; 
    CloneByAssignment c = new CloneByAssignment(); 
    public Object clone() throws
                   CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
}

public class ObjectCloning {

    public static void main(String[] args) 
    { 
    	CloneByAssignment ob1 = new CloneByAssignment(); 
  
         System.out.println(ob1.x + " " + ob1.y);
         CloneByAssignment ob2 = ob1; 
         ob2.x = 100; //POINTING AT SAME MEMORY
  
         System.out.println(ob1.x+" "+ob1.y); 
         System.out.println(ob2.x+" "+ob2.y); 
    } 
}
