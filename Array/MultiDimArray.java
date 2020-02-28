package Array;

public class MultiDimArray {
	public static void main(String[] args) {
	//Syntax to Declare Multidimensional Array in Java
	int[][] arr1;   
	int [][]arr2;   
	int arr3[][];
	int []arr4[];  
	
	//Example to instantiate Multidimensional Array in Java
	//Java Program to illustrate the use of multidimensional array   
	//declaring and initializing 2D array  
	int arr5[][]={{1,2,3},{2,4,5},{4,4,5}};
	
	//printing 2D array  
	for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
			 System.out.print(arr5[i][j]+" ");  
		 }  
		System.out.println();  
	   } 
	}
}
