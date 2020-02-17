package com.aggregationexample;

public class Patient {
	int id;  
	String name;
	Disease disease;
	
	public Patient(int id, String name, Disease disease) {
		this.id = id;  
	    this.name = name;  
	    this.disease=disease;  
	}
  
	void display(){  
		System.out.println("patient id: " +id+ " name: "+name);  
		System.out.println("has " + disease.getName());
		System.out.println("Disease stage is " + disease.getLevel());
	}  

}