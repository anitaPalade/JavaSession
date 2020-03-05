package ioexamples;


import java.io.*; 
//Java program demonstrating FileInputStream 
//C:\Users\anurag.singh\Desktop\

public class FileInputStreamExampl3 {
	
		public static void main(String args[]) throws IOException 
		{ 

			//attach the file to FileInputStream 
			FileInputStream fin= new FileInputStream("C:\\Users\\anurag.singh\\Desktop\\test.txt"); 

			//illustrating getChannel() method 
			System.out.println(fin.getChannel()); 

			//illustrating getFD() method 
			System.out.println(fin.getFD()); 

			//illustrating available method 
			System.out.println("Number of remaining bytes:"+fin.available()); 

			fin.skip(4); 
			System.out.println("FileContents :"); 
			//read characters from FileInputStream and write them 
			int ch; 
			while((ch=fin.read())!=-1) 
				System.out.print((char)ch); 
			
			//close the file 
			fin.close(); 
		} 
}
