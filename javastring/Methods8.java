package javastring;
import java.util.Arrays;
public class Methods8 {
public static void main(String args[]) {
	String alphabets = "ABCDEF";
	byte[] arr=alphabets.getBytes(); 
	for( int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);   //Returns the array of sequence of bytes of each character in an array
	}
	String character = "Hello this is java";
	char[] chArray = new char[10];
	//void getChars(int srcBegin, int srcEnd, char[] dest, int destBegin)
	character.getChars(2, 10, chArray, 0);
	System.out.println(chArray);  //Returns an array of character of the string
	
	int number = 23;  
	String str = String.valueOf(number);  
	System.out.println(str);  //Returns the string representation of char,int,long etc.
	
	String hash = "hashcode";
	System.out.println(hash.hashCode());  //Returns the hashcode of the string object

}
}
