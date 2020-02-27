//class Hello{
// 
//}

//public class ClassNotFoundExceptionExample {
//   public static void main(String args[]) throws ClassNotFoundException{
//      Class.forName("Hello");
//      System.out.println("Hello class successfully loaded");
//      
//   }
	

public class ClassNotFoundExceptionExample {
	 
    public static void main(String[] args) {
        try {
            Class loadedClass = Class.forName("Myclass");
            System.out.println("Class " + loadedClass + " found successfully!");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("A ClassNotFoundException was caught: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
	