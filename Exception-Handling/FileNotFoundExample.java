import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;

public class FileNotFoundExample {
	 public static void main(String args[])  { 
		 File file = new File("E:\\Users\\avanti.gawali\\Documents\\AWS\\cmds of aws.txt"); //  file does not exist
		 FileInputStream fileInputStream = null;   
		
		 try {  
	          FileReader fr = new FileReader(file); 
	          System.out.println("File exist"); 
	          }   
	           catch (FileNotFoundException e) { 
	           System.out.println(e); 
	           } 
	        
		 
	        try{
			fileInputStream = new FileInputStream(file);
	        fileInputStream.read();
	         }
	        catch (IOException e){         
	        System.out.println("IOException ocurs");
	        e.printStackTrace();
	        }

	      }
	 } 
	
	

