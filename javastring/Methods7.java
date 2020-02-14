package javastring;

public class Methods7 {
public static void main(String[] args) {
	String name1 = new String("Anita");  // name1 refers to Object in the Heap Area
	String name2 = name1.intern();  // name2 refers to Object in the String pool Area
	System.out.println(name1 == name2);  //comparing memory location
	System.out.println(name1.equals(name2)); //comparing only values
	String name3 = "Avanti";
	System.out.println(name2 == name3); // name3 refers to Object in the String pool Area
	
	
}
}
