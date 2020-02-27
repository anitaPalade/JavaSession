package javastring;

public class Methods4 {
public static void main(String args[]) {
	String change = "Mumbai";
	System.out.println("The output of replace: " + change.replace("m", "b"));  //returns the new string replacing the characters with the new specified character
	
	String changeAll = "Mumbai";
	System.out.println("The output of replaceAll: " + changeAll.replaceAll("Mumbai", "Bombay"));  //returns the new string replacing the complete string with the new one
	
	String changeFirst = "MuMbai";
	System.out.println("The output of replaceFirst: " + changeFirst.replaceFirst("M", "n"));  //Returns the new string replacing the specified character which occurs first in the string
	
	char[] copyValueFrom = {'c','o','p','y'};
	String copyValueTo= "";
	System.out.println("The output of copyValueOf: " + copyValueTo.copyValueOf(copyValueFrom));  // Returns a String that represents the characters of a char array.
	
	String bucket = "full";
	String jar = "";
	System.out.println("The output of isEmpty: " + bucket.isEmpty());
	System.out.println("The output of isEmpty: " + jar.isEmpty());  //Returns boolean value checking whether the string is empty or not

}
}
