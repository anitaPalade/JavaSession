
public class ArithmeticExample {
	public static void main(String[] args) {
		int x=10,y=6;
		 
		System.out.println(x + y);	//Addition of 2 numbers
		
		System.out.println(x - y);	//Subtraction of 2 numbers
		
		System.out.println(x * y);	//Multiplication of 2 numbers
		
		System.out.println(x / y);	//Division of 2 numbers

		System.out.println(x % y);	//modulus of 2 numbers gives Reminder in output
		
		System.out.println("\n");
		System.out.println(x++);	// value of x will print then increment will done i.e x=11
		System.out.println(++x);	// Now x will increment first i.e 12 & then printed 
		System.out.println(x--);	// here same the value will print first then decrement i.e x=11
		System.out.println(--x);	// now x will decrement first i.e 10 & then printed
		
		System.out.println("\n");
		System.out.println(x++ + ++y);	// Here x=10 & y=7 will add & x will be x=11 & y=7
		System.out.println(x++ + y++);	// x=11 & y=7 will add
	}
}
