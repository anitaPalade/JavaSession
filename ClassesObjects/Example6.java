package ClassesObjects;

class Student3{  
void show()
{
System.out.println("hello Harry");
} 
void display()
{ 
System.out.println("hello Hermione");   
this.show();  
}  
}
class Example6{  
public static void main(String args[]){  
Student3 stud = new Student3();  
stud.display();  
}
}  
