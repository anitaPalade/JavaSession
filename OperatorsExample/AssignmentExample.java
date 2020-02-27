public class AssignmentExample {
	public static void main(String[] args) {
		int x=10;
		
		x += 1;	
		System.out.println(x);	//x=x+1 will be there
		
		 x %= 3;
		    System.out.println(x);
		
		System.out.println("Left Shift: ");
		System.out.println(10<<2); //Left shift by 2 bits
		System.out.println(10<<3);	//Left shift by 3 bits
		System.out.println(5<<2);	//Left shift by 2 bits
		System.out.println(5<<3);	//Left shift by 3 bits
		
		System.out.println("Right Shift: ");
		System.out.println(10>>2);	//Right shift by 2 bits
		System.out.println(11>>3);	//Right shift by 3 bits
		System.out.println(20>>2);  //Right shift by 2 bits
		System.out.println(20>>3);	//Right shift by 3 bits
	}
}
