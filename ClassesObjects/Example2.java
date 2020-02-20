package ClassesObjects;

class Example2{  
    int id;  
    String name;  
    
    Example2(int i,String n){  
    id = i;  
    name = n;  
    }  
   
    void display()
    {
    System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
    
    Example2 s1 = new Example2(111,"Harry");  
    Example2 s2 = new Example2(222,"Ron");  
    s1.display();  
    s2.display();  
   }  
}  