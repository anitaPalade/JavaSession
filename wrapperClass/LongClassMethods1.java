package wrapperClass;
//Java program to illustrate 
//various Long class methods 
public class LongClassMethods1 
{ 
	public static void main(String args[]) 
	{ 
		long value1 = 55; 
		String value2 = "45"; 

		// Construct two Long objects 
		Long x = new Long(value1); 
		Long y = new Long(value2); 

		// toString() 
		System.out.println("toString(value1) = " + Long.toString(value1)); 
		System.out.println("---------------------------");

		// toHexString(),toOctalString(),toBinaryString() 
		// converts into hexadecimal, octal and binary forms. 
		System.out.println("toHexString(value1) =" + Long.toHexString(value1)); 
		System.out.println("toOctalString(value1) =" + Long.toOctalString(value1)); 
		System.out.println("toBinaryString(value1) =" + Long.toBinaryString(value1)); 
		System.out.println("---------------------------");
		// valueOf(): return Long object 
		// an overloaded method takes radix as well. 
		Long z = Long.valueOf(value1); 
		System.out.println("valueOf(value1) = " + z); 
		z = Long.valueOf(value2); 
		System.out.println("ValueOf(value2) = " + z); 
		z = Long.valueOf(value2, 6); 
		System.out.println("ValueOf(value2,6) = " + z); 
		System.out.println("---------------------------");
		// parseLong(): return primitive long value 
		// an overloaded method takes radix as well 
		long zz = Long.parseLong(value2); 
		System.out.println("parseLong(value2) = " + zz); 
		zz = Long.parseLong(value2, 6); 
		System.out.println("parseLong(value2,6) = " + zz); 
		System.out.println("---------------------------");

		// an overloaded getLong() method 
		// which return default value if property not found. 
		System.out.println("getLong(abcd,10) =" + Long.getLong("abcd", 10)); 

		// decode() : decodes the hex,octal and decimal 
		// string to corresponding long values. 
		String decimal = "45"; 
		String octal = "005"; 
		String hex = "0x0f"; 

		Long dec = Long.decode(decimal); 
		System.out.println("decode(45) = " + dec); 
		dec = Long.decode(octal); 
		System.out.println("decode(005) = " + dec); 
		dec = Long.decode(hex); 
		System.out.println("decode(0x0f) = " + dec); 
		System.out.println("---------------------------");
		// rotateLeft and rotateRight can be used 
		// to rotate bits by specified distance 
		long valrot = 2; 
		System.out.println("rotateLeft(0000 0000 0000 0010 , 2) =" + 
									Long.rotateLeft(valrot, 2)); 
		System.out.println("rotateRight(0000 0000 0000 0010,3) =" + 
									Long.rotateRight(valrot, 3)); 
	} 
} 
