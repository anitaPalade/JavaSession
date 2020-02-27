package Interface;

interface Writable{  
	void write();  
}  

interface Displayable extends Writable{  
	void show();  
}  

class InterfaceInheritance implements Displayable{  
	public void write(){
		System.out.println("Hello");
	}  
	public void show(){
		System.out.println("Welcome");
	}  
  
	public static void main(String args[]){  
		InterfaceInheritance obj = new InterfaceInheritance();  
		obj.write();  
		obj.show();  
 }  
}  