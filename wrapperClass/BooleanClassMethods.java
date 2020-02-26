package wrapperClass;

//Java program to demonstrate parseBoolean() method 
public class BooleanClassMethods {
	public static void main(String[] args) {
		// parsing different Strings
		boolean b1 = Boolean.parseBoolean("Tre");
		boolean b2 = Boolean.parseBoolean("TruE");
		boolean b3 = Boolean.parseBoolean("False");
		boolean b4 = Boolean.parseBoolean("FALSE");
		boolean b5 = Boolean.parseBoolean("Perficient");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println("----------------");

		Boolean b6 = Boolean.valueOf("true");
		Boolean b7 = Boolean.valueOf("TRue");
		Boolean b8 = Boolean.valueOf("False");
		Boolean b9 = Boolean.valueOf("Perficient");
		Boolean b10 = Boolean.valueOf(null);

		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(b9);
		System.out.println(b10);
		System.out.println("----------------");

		boolean b11 = true;
		boolean b12 = false;

		// getting String value of the primitives boolean
		String str1 = Boolean.toString(b11);
		String str2 = Boolean.toString(b12);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println("----------------");

		Boolean b13 = new Boolean("True");
		Boolean b14 = new Boolean("False");
		Boolean b15 = new Boolean("Perficient");
		Boolean b16 = new Boolean(null);

		// getting String value of Boolean objects
		String str11 = b13.toString();
		String str22 = b14.toString();
		String str3 = b15.toString();
		String str4 = b16.toString();

		System.out.println(str11);
		System.out.println(str22);
		System.out.println(str3);
		System.out.println(str4);
	}
}
