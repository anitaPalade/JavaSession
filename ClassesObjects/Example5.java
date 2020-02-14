package ClassesObjects;

class Student2
{  
int rollno;  
String name;  
float fee;  

Student2(int rollno,String name,float fee)
{  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){
	System.out.println(rollno+" "+name+" "+fee);
	}  
}  
  
class Example5{  
public static void main(String args[])
{  
Student2 s1=new Student2(111,"Harry",500);  
Student2 s2=new Student2(112,"Ron",600);  
s1.display();  
s2.display();  
}
}  