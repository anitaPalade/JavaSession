package com.multilevel;

public class Main {  
		public static void main(String args[]){  
		Animal animal = new Animal();
		Puppy puppy=new Puppy();  
			puppy.weep();  
			puppy.bark();  
			puppy.eat(); 
			
		Cat cat = new Cat();
			cat.meawing();
			cat.eat();
			
			System.out.println("Dog is a Animal or NOT ? :"+(puppy instanceof Animal));
			System.out.println("Cat is an Animal or NOT ? :"+(cat instanceof Animal));
			System.out.println("Animal is an Object or NOT ? :"+(animal instanceof Object));
		}
}
