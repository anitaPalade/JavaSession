package wrapperClass;

public class ByteClassMethods 
{ 
	public static void main(String[] args) 
	{ 
		byte value1 = 55; 
		String value2 = "45"; 
		
		Byte value3 = new Byte(value1); 
		Byte value4 = new Byte(value2); 

		// toString() 
		System.out.println("toString(value1) = " + Byte.toString(value1)); 
		System.out.println("-----------------------");

		// valueOf() 
		// return Byte object 
		Byte z = Byte.valueOf(value1); 
		System.out.println("valueOf(value1) = " + z); 
		z = Byte.valueOf(value2); 
		System.out.println("ValueOf(value2) = " + z); 
		System.out.println("-----------------------");
		// parseByte() 
		// return primitive byte value 
		byte zz = Byte.parseByte(value2); 
		System.out.println("parseByte(value2) = " + zz); 
		zz = Byte.parseByte(value2, 6); 
		System.out.println("parseByte(value2,10)= " + zz); 
		System.out.println("-----------------------");
		
		//decode() 
		String decimal = "45"; 
		String octal = "005"; 
		String hex = "0x0f"; 
		
		Byte dec=Byte.decode(decimal); 
		System.out.println("decode(45) = " + dec); 
		dec=Byte.decode(octal); 
		System.out.println("decode(005) = " + dec); 
		dec=Byte.decode(hex); 
		System.out.println("decode(0x0f) = " + dec); 
		System.out.println("-----------------------");
		
		System.out.println("bytevalue(value3) = " + value3.byteValue()); 
		System.out.println("shortvalue(value3) = " + value3.shortValue()); 
		System.out.println("intvalue(value3) = " + value3.intValue()); 
		System.out.println("longvalue(value3) = " + value3.longValue()); 
		System.out.println("doublevalue(value3) = " + value3.doubleValue()); 
		System.out.println("floatvalue(value3) = " + value3.floatValue()); 
		System.out.println("-----------------------");
	    Byte byte1 = 22;
	    Byte byte2 = 33;
	    String byte3 = "22";
	    //Byte byte4 = Byte.parseByte(byte3);
		//boolean eq=byte1.toString().equals(byte3);
		boolean eq=byte1.equals(Byte.parseByte(byte3));
		System.out.println("value3.equals(value4) = " + eq); 
		System.out.println("-----------------------");
		
//		int e=Byte.compare(byte1, byte3); 
//		System.out.println("compare(value3,value4) = " + e); 
//		System.out.println("-----------------------");
//		
//		int f=byte1.compareTo(byte3); 
//		System.out.println("value3.compareTo(value4) = " + f); 
	} 
} 
