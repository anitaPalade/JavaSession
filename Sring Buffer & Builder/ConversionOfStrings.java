
public class ConversionOfStrings {
	public static void main(String[] args) {
		String simple = "Hello";
		
		StringBuffer string1 = new StringBuffer(simple);	//Conversion into buffer from literal
		
		System.out.println(string1.capacity());		//By default capacity is 16
	
		System.out.println(string1.insert(2,"llll"));	//Insert string from given offset
		
		System.out.println(string1.reverse());	//Reverse the string
		
		StringBuilder string2 = new StringBuilder(simple);	//Conversion into Builder from literal
		string2.append("World!");
		System.out.println(string2);	//Join the strings
	}
}
