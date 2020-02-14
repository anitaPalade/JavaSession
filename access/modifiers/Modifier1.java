package com.access.modifiers;

class Example
{	 
	private String name; 
	
	public String getName() 
	{  
		return name;  
	}  
	public void setName(String newName) 
	{   
		name = newName;  
	}	
	private void aMethod() {
		System.out.println("Here is the Private Method.");
	}
	public void anotherMethod() {
		System.out.println("\n\nPublic method accessing priavte method.");
		this.aMethod();
	}
}

class Modifier1
{
	public static void main(String [ ] args) 
	{  
		Example obj =new Example();
		obj.setName("Perficient");   
		System.out.print("Getting Private Variable from other class, ");
		System.out.print("Name  : " + obj.getName());
		obj.anotherMethod();
	}  

}


