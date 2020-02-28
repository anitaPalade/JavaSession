package ioexamples;
//Java program to demonstrate creating a text file using FileOutputStream 
import java.io.BufferedOutputStream; 
import java.io.DataInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
public class FileOutputStreamExample3 {


	public static void main(String[] args) throws IOException 
	{ 
		//attach keyboard to DataInputStream 
		DataInputStream dis=new DataInputStream(System.in); 

		// attach file to FileOutputStream 
		FileOutputStream fout=new FileOutputStream("C:\\Users\\anurag.singh\\Desktop\\newfile.txt"); 
		//TO APPEND DATA
//		FileOutputStream fout=new FileOutputStream("C:\\Users\\anurag.singh\\Desktop\\newfile.txt",true);

		//attach FileOutputStream to BufferedOutputStream 
		BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
		System.out.println("Enter text (@ at the end):"); 
		char ch; 

		//read characters from dis into ch. Then write them into bout. 
		//repeat this as long as the read character is not @ 
		while((ch=(char)dis.read())!='@') 
		{ 
			bout.write(ch); 
		} 
		//close the file 
		bout.close(); 
	} 
} 