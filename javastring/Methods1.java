package javastring;

public class Methods1 {
public static void main(String[] args) {
	
	String checkStartEnd = "Check";  //Returns boolean values if the string starts and end with the specified character and is case sensitive
	System.out.println(checkStartEnd.startsWith("C"));
	System.out.println(checkStartEnd.startsWith("c"));
	System.out.println(checkStartEnd.endsWith("k"));
	
	String combine = "book";
	System.out.println("The output of concat: " + combine.concat("mark"));  //returns the string with the string appended at the end of the given string
	
	String sample = "JAVA";
	System.out.println(sample.toCharArray());  //return the array of characters from character of string
	
	String countLength = "Perficient";
	System.out.println("The output of length: " + countLength.length());  //returns the integer value giving the count of the characters in the string
	
	String part1 = "Maharashtra";
	System.out.println("The output of subString: " + part1.substring(0, 4));   //returns the substring with the specified begin and end index
	
	String part2 = "Kar nataka";
	System.out.println("The output of subSequence: " + part2.subSequence(3, 6));  //Returns the sequence of character within the specified range
}
}
