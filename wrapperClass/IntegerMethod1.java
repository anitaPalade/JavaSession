package wrapperClass;

public class IntegerMethod1 {
	public static void main(String args[]) {
		int value1 = 55;
		String value2 = "45";

		// Construct two Integer objects
		Integer value3 = new Integer(value1);
		Integer value4 = new Integer(value2);

		// toString()
		System.out.println("toString(value1) = " + Integer.toString(value1));
		System.out.println("-----------------------");
		// toHexString(),toOctalString(),toBinaryString()
		// converts into hexadecimal, octal and binary forms.
		System.out.println("toHexString(value1) =" + Integer.toHexString(value1));
		System.out.println("toOctalString(value1) =" + Integer.toOctalString(value1));
		System.out.println("toBinaryString(value1) =" + Integer.toBinaryString(value1));
		System.out.println("-----------------------");
		// valueOf(): return Integer object
		// an overloaded method takes radix as well.
		Integer z = Integer.valueOf(value1);
		System.out.println("valueOf(value1) = " + z);
		z = Integer.valueOf(value2);
		System.out.println("ValueOf(value2) = " + z);
		z = Integer.valueOf(value2, 6);
		System.out.println("ValueOf(value2,6) = " + z);
		System.out.println("-----------------------");
		// parseInt(): return primitive int value
		// an overloaded method takes radix as well
		int zz = Integer.parseInt(value2);
		System.out.println("parseInt(value2) = " + zz);
		zz = Integer.parseInt(value2, 6);
		System.out.println("parseInt(value2,6) = " + zz);
		System.out.println("-----------------------");
		// getInteger(): can be used to retrieve
		// int value of system property
		int prop = Integer.getInteger("sun.arch.data.model");
		System.out.println("getInteger(sun.arch.data.model) = " + prop);
		System.out.println("getInteger(abcd) =" + Integer.getInteger("abcd"));
		// an overloaded getInteger() method
		// which return default value if property not found.
		System.out.println("getInteger(abcd,10) =" + Integer.getInteger("abcd", 10));
		System.out.println("-----------------------");
		// decode() : decodes the hex,octal and decimal
		// string to corresponding int values.
		String decimal = "45";
		String octal = "005";
		String hex = "0x0f";
		Integer dec = Integer.decode(decimal);
		System.out.println("decode(45) = " + dec);
		dec = Integer.decode(octal);
		System.out.println("decode(005) = " + dec);
		dec = Integer.decode(hex);
		System.out.println("decode(0x0f) = " + dec);
		System.out.println("-----------------------");
		// rotateLeft and rotateRight can be used
		// to rotate bits by specified distance
		int valrot = 2;
		System.out.println("rotateLeft(0000 0000 0000 0010 , 2) =" + Integer.rotateLeft(valrot, 2));
		System.out.println("rotateRight(0000 0000 0000 0010,3) =" + Integer.rotateRight(valrot, 3));
	}
}