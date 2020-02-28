
public class LocalInner {
	private int data=100;
	
	void display() {
		
		class Inner{
			void display() {
				System.out.println("Value of data is "+data);
			}
		}
		
		Inner in = new Inner();	// Instantiating inner class
		in.display();
	}
	
	public static void main(String[] args) {	
		LocalInner outer = new LocalInner();	// Instantiating outer class
		outer.display();
	}
}
