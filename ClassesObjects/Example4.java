package ClassesObjects;

class Student1{  
    int rollno;  
    String name;  			
    static String college = "XYZ"; //static variable
    
    static void change()    //static method to change the value of static variable
    {  
    college = "Hogwarts";  
    }  
    
    Student1(int r, String n)  //constructor to initialize the variable 
    {  
    rollno = r;  
    name = n;  
    }  
    
    //static block
    
    static {
    	System.out.println("Static block initialized.");
    	}
    

    void display(){
    	System.out.println(rollno+" "+name+" "+college);
    	}  
}  
public class Example4{  
   public static void main(String args[]){  
	   
   Student1.change();
   
   Student1 s1 = new Student1(111,"Harry");  
   Student1 s2 = new Student1(222,"Ron");  
   Student1 s3 = new Student1(333,"Hermione");  
   s1.display();  
   s2.display();  
   s3.display();  
   }  
}