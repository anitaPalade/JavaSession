package ioexamples;

import java.io.*; 

//Java program illustrating the working of InputStream method 
//mark(), read(), skip() 
//markSupported(), close(), reset() 
//C:\Users\anurag.singh\Desktop\

public class InputStreamExample0 {

	public static void main(String[] args) throws Exception 
		{ 
			InputStream ins = null; 
			try { 
	
				ins = new FileInputStream("C:\\Users\\anurag.singh\\Desktop\\readtest.txt"); 
	
				// read() method : reading and printing Characters 
				// one by one 
				System.out.println("Char : "+(char)ins.read()); 
				System.out.println("Char : "+(char)ins.read()); 
				System.out.println("Char : "+(char)ins.read()); 
	
				// mark() : read limiting the 'ins' input stream 
				ins.mark(0); 
	
				ins.skip(1); 
				System.out.println("skip() method comes to play"); 
				System.out.println("mark() method comes to play"); 
				System.out.println("Char : "+(char)ins.read()); 
				System.out.println("Char : "+(char)ins.read()); 
				System.out.println("Char : "+(char)ins.read()); 
	
				boolean check = ins.markSupported(); 
				if (ins.markSupported()) 
				{ 
					// reset() method : repositioning the stram to 
					// marked positions. 
					ins.reset(); 
					System.out.println("reset() invoked"); 
					System.out.println("Char : "+(char)ins.read()); 
					System.out.println("Char : "+(char)ins.read()); 
				} 
				else
					System.out.println("reset() method not supported."); 
	
	
				System.out.println("ins.markSupported() supported"+ 
								" reset() : "+check); 
	
			} 
			catch(Exception excpt) 
			{ 
				// in case of I/O error 
				excpt.printStackTrace(); 
			} 
			finally
			{ 
				// releasing the resources back to the 
				// GarbageCollector when closes 
				if (ins!=null) 
				{ 
					// Use of close() : closing the file 
					// and releasing resources 
					ins.close(); 
				} 
			} 
	} 
} 
