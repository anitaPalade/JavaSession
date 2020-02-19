
public class MethodOverloading {
public static void main(String args[]) {
	System.out.println("This is main method");
	MethodOverloading object = new MethodOverloading();
	object.main(3);
}
public static void main(int a) {
	System.out.println("This is also a main method");
}
}
