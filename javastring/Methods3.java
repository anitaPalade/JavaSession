package javastring;

public class Methods3 {
public static void main(String[] args) {
	String lowerCase = "HELLO World";
	System.out.println("The output of toLowerCase: " + lowerCase.toLowerCase());  //returns the string in lower case
	
	String upperCase = "This is a new program";
	System.out.println("The output of toUpperCase: " + upperCase.toUpperCase());   //returns the string in upper case
	
	String removeSpace = " HELLO WORLD ";
	System.out.println("The output of removeSpace: " + "x" + removeSpace.trim()+ "x");  //returns the string removing the spaces form front and back of the string
	
	String date = "20/2/2020/" + null;
	String array1[] = date.split("/");
	System.out.println("array1: "+array1[0]);
	System.out.println("array2: "+array1[1]);
	for(String temp1 : array1) {
	System.out.println("The output of split: " + temp1);  //Returns the string into substring based on the regular expression, there is no limit on the substrings
	}
	String array2[] = date.split("/", 2);
	for(String temp2 : array2) {
	System.out.println("The output of split with positive limit: " + temp2);   //Returns the string into substring based on the regular expression, with the limit of 2 on the substrings
	}
	String array3[] = date.split("/", 0);
	for(String temp3 : array3) {
	System.out.println("The output of split with 0 limit: " + temp3);    //Returns the string into substring based on the regular expression, with the limit of 0 on the substrings
	}
	String array4[] = date.split("/", -1);
	for(String temp4 : array4) {
	System.out.println("The output of split with negative -1 limit: " + temp4);    //Returns the string into substring based on the regular expression, with the limit of -5 on the substrings
	}
}
}
