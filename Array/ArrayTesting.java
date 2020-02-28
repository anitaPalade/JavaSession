package Array;
import java.util.*;

/*
 * Java array is an object which contains elements of a similar data type.
 *  Additionally, The elements of an array are stored in a contiguous memory location.
 *   It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
 */

public class ArrayTesting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//Syntax to Declare an Array in Java
		int[] arr1; 
		
		//Instantiation of an Array in Java
		arr1 =new int[3];
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("enter number");
			arr1[i] = scanner.nextInt();
		}
		
		//declaration, instantiation and initialization
		int arr2[]={4,5,6};
		
		for(int i=0; i<arr2.length;i++) {
			System.out.println("array1: "+ arr1[i]);
			System.out.println("array2: "+ arr2[i]);
		}
		
		//For-each Loop for Java Array
		
		//The Java for-each loop prints the array elements one by one. It holds an array element in a variable, then executes the body of the loop.
		
		int arr3[]={8,9,10,11};  
		//printing array using for-each loop  
		for(int i:arr3)  
			System.out.println(i);  
	}
}
