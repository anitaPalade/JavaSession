package ioexamples;

//Java program to demonstrate working of BufferedInputStream 
import java.io.BufferedInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 

//Java program to demonstrate BufferedInputStream methods 
//FILE DIRECTORY PATH C:\Users\anurag.singh\Desktop\

public class BufferedInExample {
	public static void main(String args[]) throws IOException 
	{ 
		// attach the file to FileInputStream 
		FileInputStream fin = new FileInputStream("C:\\Users\\anurag.singh\\Desktop\\Calculator.java"); 

		BufferedInputStream bin = new BufferedInputStream(fin); 

		// illustrating available method 
		System.out.println("Number of remaining bytes:" + bin.available()); 

		// illustrating markSupported() and mark() method 
		boolean b=bin.markSupported(); 
		if (b) 
			bin.mark(bin.available()); 

		// illustrating skip method 
		bin.skip(4); 
		System.out.println("FileContents :"); 

		// read characters from FileInputStream and 
		// write them 
		int ch; 
		while ((ch=bin.read()) != -1) 
			System.out.print((char)ch); 

		// illustrating reset() method 
		bin.reset(); 
		while ((ch=bin.read()) != -1) 
			System.out.print((char)ch); 

		// close the file 
		fin.close(); 
	} 
} 
