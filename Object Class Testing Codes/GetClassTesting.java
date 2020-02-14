package objectClassTesting;

public class GetClassTesting {
	public static void main(String[] args) {
		
	/*Returns the class object of “this” object and used to get actual runtime class of the object.
	It can also be used to get metadata of this class
	____FINAL METHOD_____ */
		
		Object testObjOne = new String("Get Class Method Testing"); 
		Integer i = new Integer(10); 
		
        System.out.println("Class of Object testObjOne is : " + testObjOne.getClass());
        System.out.println("Class of Object i is : " + i.getClass());
	}
}
