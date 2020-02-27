import java.util.Optional;

public class EncapsulationExample2 {
	
	 public static void main (String[] args)  
	    { 
	        EncapsulationExample1 encapsulationExample1 = new EncapsulationExample1(); 
	        
	        // setting values of the variables  
	        encapsulationExample1.setName("Harry Potter"); 
	        encapsulationExample1.setAge(16); 
	        encapsulationExample1.setRoll(50); 
	          
	        // Displaying values of the variables 
	        System.out.println("name: " + encapsulationExample1.getName()); 
	        System.out.println("age: " + encapsulationExample1.getAge()); 
	        System.out.println("roll: " + encapsulationExample1.getRoll()); 
	        printPayload(encapsulationExample1);
	    }

	private static void printPayload(EncapsulationExample1 encapsulationExample1) {
		// TODO Auto-generated method stub
		System.out.println("encapsulationExample1: "+encapsulationExample1.getName());
		Optional<EncapsulationExample1> enc = Optional.ofNullable(encapsulationExample1);
		System.out.println("result" +enc.isPresent());
	}
}
