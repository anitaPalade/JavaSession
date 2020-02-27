package FourthPackage;

import FirstPackage.*; //First type of importing package

import SecondPackage.ExamplePackage2; //second type of importing package

public class ExamplePackage4 {

	public static void main(String args[]){  
		  
		ExamplePackage1 myFirstObject = new ExamplePackage1();
		
		ExamplePackage2 mySecondObject = new ExamplePackage2();
		
		ThirdPackage.ExamplePackage3 myThirdObject = new ThirdPackage.ExamplePackage3(); //third type of importing package
		
		   myFirstObject.message(); 
		   mySecondObject.display();
		   myThirdObject.show();
	}
}





