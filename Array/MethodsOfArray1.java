package Array;
import java.util.Arrays;

public class MethodsOfArray1 {
	public static void main(String[] args) {
		//static <T> List<T> asList(T… a): This method returns a fixed-size list backed by the specified Arrays.
	    int intArr[] = { 10, 20, 15, 22, 35,43 }; 
	    int intKey = 22; 
	    
        // To convert the elements as List 
        System.out.println("Integer Array as List: "+ Arrays.asList(intArr)); 
        
        //static int binarySearch(elementToBeSearched): 
        //These methods searches for the specified element in the array with the help of Binary Search algorithm.
        
        Arrays.sort(intArr); 
        
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey)); 
        
        int intArr1[] = { 10, 15, 22}; 
        //copyOf(originalArray, newLength): This method copies the specified array,
        //truncating or padding with the default value (if necessary) so the copy has the specified length.  
        System.out.println("\nNew Arrays by copyOf:"); 
  
        System.out.println("Integer Array1: "+ Arrays.toString(Arrays.copyOf(intArr1, 10))); 

        
        //copyOfRange(originalArray, fromIndex, endIndex): 
        //This method copies the specified range of the specified array into a new Arrays.
        int intArr2[] = {32,64,128,256};
        System.out.println("\nNew Arrays by copyOfRange:"); 
  
        // To copy the array into an array of new length 
        System.out.println("Integer Array2: "+ Arrays.toString(Arrays.copyOfRange(intArr2, 1, 3)));
        
        //fill(originalArray, fillValue): This method assigns this fillValue to each index of this Arrays.
        int intArr3[] = {2,3,4,5,6,7,8,9,0};
        Arrays.fill(intArr3, intKey); 
        System.out.println("\nFill range Integer Array3 on filling: "+ Arrays.toString(intArr3));
        // To fill the arrays 
        
        int intArr4[] = {3,4,5,6,6,2,324,23,546,45};
        Arrays.fill(intArr4,3,5, intKey);  
        System.out.println("\nFill range Integer Array4 on filling: "+ Arrays.toString(intArr4));
        
        //parallelSort(originalArray): This method sorts the specified array using parallel sort.
        int intArr5[] = {23,43,65,7,54,76};
        Arrays.parallelSort(intArr5); 
        System.out.println("\nParallel sort Integer Array5: "+ Arrays.toString(intArr5));
        
        //sort(originalArray): This method sorts the complete array in ascending order
        int intArr6[] = {23,90,16,5,35,67,79,60,0};
        Arrays.sort(intArr6); 
        System.out.println("\nSort Integer Array6: "+ Arrays.toString(intArr6)); 
        
	}
	
}
