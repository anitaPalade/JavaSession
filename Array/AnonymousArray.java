package Array;

public class AnonymousArray {
	//Java Program to demonstrate the way of passing an anonymous array  
	//to method.  
	//creating a method which receives an array as a parameter  
	static int[] printArray(int arr[]){  
		for(int i=0;i<arr.length;i++) {  
			System.out.println(arr[i]);
			arr[i]= arr[i]/arr[i];
		}
		return arr;
	}  
	  
	public static void main(String args[]){  
		int[] result = printArray(new int[]{10,22,44});//passing anonymous array to method
		
		for(int i:result)
			System.out.println(i);
	}
}
