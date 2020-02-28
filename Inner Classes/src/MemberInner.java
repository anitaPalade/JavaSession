
public class MemberInner {
	private int value=10;
	
	class Inner{
		void message() {
			System.out.println("Value is "+value);
		}
	}
		
		void display() {
			Inner inner = new Inner();	// Instantiating inner class
			inner.message();	//Accessing display method
		}
	
	public static void main(String[] args) {
		MemberInner outer = new MemberInner();	// Instantiating outer class
		
		outer.display();	//Accessing display method
	}
}
