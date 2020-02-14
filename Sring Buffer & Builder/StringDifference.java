public class StringDifference {
	
	public static void concat1(String string1) {
		string1 += "world"; 	
	}
	
	public static void concat2(StringBuffer string2) {
		string2.append("world!");
	}
	
	public static void concat3(StringBuilder string3) {
		string3.append("world!");
	}
	
	public static void main(String[] args) {
		String string1 = "Hello";
		concat1(string1);
		System.out.println(string1);	// String class is Immutable so the value will be "Hello".
		
		StringBuffer string2 = new StringBuffer("Hello");
		concat2(string2);
		System.out.println(string2);	// String Buffer is Mutable so the value will be "HelloWorld!" 
		
		StringBuilder string3 = new StringBuilder("Hello");
		concat3(string3);
		System.out.println(string3);	// String Builder is Mutable so the value will be "HelloWorld!"
		
	}
}
	