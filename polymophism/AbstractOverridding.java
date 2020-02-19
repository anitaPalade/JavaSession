abstract class Test{
	abstract void display();
}
class Test2 extends Test{
	void display() {
		System.out.println("This is overridden abstract method");
	}
}
public class AbstractOverridding {
public static void main(String args[]) {
	Test2 obj = new Test2();
	obj.display();
}
}
