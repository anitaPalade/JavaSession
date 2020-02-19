
public class TypeConversion {
	void show(int num) {
		System.out.println("int method");
	}
	void show(String name) {
		System.out.println("String method");
	}
public static void main(String args[]) {
	TypeConversion type = new TypeConversion();
	type.show('a');
}
}
