package Array;

public class NameOfArrayClass {
	//Java Program to get the class name of array in Java  
	public static void main(String args[]){  
	//declaration and initialization of array  
	int arr[]={4,4,5};  
	char arr1[]=new char[3];
	float arr2[]=new float[3];
	String arr3[]=new String[3];
	
	//getting the class name of Java array  

	System.out.println(arr.getClass().getName());
	System.out.println(arr1.getClass().getName());
	System.out.println(arr2.getClass().getName());
	System.out.println(arr3.getClass().getName());

	}
}
