package ClassesObjects;

public class Example7 {
	public static void main(String args[]) 
	{
	     int arr[] = {1,3,8,7,10,11,12,9,34,56,43,32};
	     int max = 0; 
	     int sum = 0;
	     for(int i = 0; i<arr.length; i++)
	     {
	            if(arr[i] > max) 
	            {
	                  max = arr[i];
	                  }
	            sum = sum+arr[i];
	     }
	     System.out.println(max);
	     System.out.println(sum);
	}
	
}

