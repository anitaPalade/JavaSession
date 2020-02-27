package javastring;

public class Methods5 {
public static void main(String [] args) {
	String name = "Airplane";
	System.out.println("The output of charAt: " + name.charAt(5));  //Gives the character at the given index
	
	String university = "RTMNU";
	System.out.println("The output of codePointAt: " + university.codePointAt(3));  //Returns the unicode of the character at the specified index
	
	String shape = "circle";
	System.out.println("The output of codePointBefore: " + shape.codePointBefore(3));  //Returns the unicode of the index before the specified index
	
	String number = "Fifty";
	System.out.println("The output of codePointCount: " + number.codePointCount(2, 5));  //Returns the Unicode in the specified text range of this String
	
	String id = "Prajakta";
	System.out.println("The output of indexOf: " + id.lastIndexOf("a")); //Returns the index of the first occurence of the character
	
	String salary = "55555";
	System.out.println("The output of lastIndexOf: " + salary.lastIndexOf("5"));  //Returns the index of  last found occurence of the character 
}
}
