package javastring;

public class Methods2 {
public static void main(String args[]) {
	String test = "ENTRY";
	System.out.println("The output of equals: " + test.equals("ENTRY"));
	System.out.println("The output of equals: " + test.equals("entry"));  //returns boolean value true if both strings are equal with the cases
	
	String check = "EXIT";
	System.out.println("The output of equalsIgnoreCase: " + check.equalsIgnoreCase("exit"));
	System.out.println("The output of equalsIgnoreCase: " + check.equalsIgnoreCase("TIXE"));  //returns the boolean value after checking if the string matches the passed string ignoring the cases
	
	String search = "Welcome to Perficient";
	System.out.println("The output of contains: " + search.contains("welcome"));  
	System.out.println("The output of contains: " + search.contains("Nagpur"));
	System.out.println("The output of contains: " + search.contains("Welcome"));  //return boolean value if the given string contains the string passed
	
	String compareString1 = "INDIA";
	String compareString2 = "INDIA";
	String compareString3 = "india";
	System.out.println("The output of compareTo: " + compareString1.compareTo(compareString2));
	System.out.println("The output of compareTo: " + compareString1.compareTo(compareString3)); //returns integer value based on the unicode values of the string with cases returns 0 if both the strings are same 
	
	String compareStringIgonreCase1 = "JAPAN";
	String compareStringIgonreCase2 = "JAPAN";
	String compareStringIgonreCase3 = "japan";
	System.out.println("The output of compareStringIgnoreCase: " + compareStringIgonreCase1.compareToIgnoreCase(compareStringIgonreCase2));
	System.out.println("The output of compareStringIgnoreCase: " + compareStringIgonreCase1.compareToIgnoreCase(compareStringIgonreCase3)); //returns integer value based on the unicode values of the string ignoring cases
	
	String checkString = "Oracle";
	System.out.println("The output of contentEquals: " + checkString.contentEquals("Oracle"));
	System.out.println("The output of contentEquals: " + checkString.contentEquals("oracle"));  //returns boolean value after checking the string without ignoring cases
	
	
	
}
}
