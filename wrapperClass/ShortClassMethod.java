package wrapperClass;

public class ShortClassMethod {

	public static void main(String[] args) {

		short value1 = 55;
		String value2 = "45";

		// Construct two Short objects
		Short value3 = new Short(value1);
		Short value4 = new Short(value2);

		// toString()
		System.out.println("toString(value1) = " + Short.toString(value1));
		System.out.println("---------------------------");

		// valueOf()
		// return Short object
		Short value5 = Short.valueOf(value1);
		System.out.println("valueOf(value1) = " + value5);
		value5 = Short.valueOf(value2);
		System.out.println("ValueOf(value2) = " + value5);
		value5 = Short.valueOf(value2, 6);
		System.out.println("ValueOf(value2,6) = " + value5);
		System.out.println("---------------------------");
		// parseShort()
		// return primitive short value
		short value6 = Short.parseShort(value2);
		System.out.println("parseShort(value2) = " + value6);
		value6 = Short.parseShort(value2, 6);
		System.out.println("parseShort(value2,10) = " + value6);
		System.out.println("---------------------------");
		// decode()
		String decimal = "45";
		String octal = "005";
		String hex = "0x0f";

		Short dec = Short.decode(decimal);
		System.out.println("decode(45) = " + dec);
		dec = Short.decode(octal);
		System.out.println("decode(005) = " + dec);
		dec = Short.decode(hex);
		System.out.println("decode(0x0f) = " + dec);
		System.out.println("---------------------------");
		System.out.println("bytevalue(value3) = " + value3.byteValue());
		System.out.println("shortvalue(value3) = " + value3.shortValue());
		System.out.println("intvalue(value3) = " + value3.intValue());
		System.out.println("longvalue(value3) = " + value3.longValue());
		System.out.println("doublevalue(value3) = " + value3.doubleValue());
		System.out.println("floatvalue(value3) = " + value3.floatValue());
		System.out.println("---------------------------");
		int hash = value3.hashCode();
		System.out.println("hashcode(value3) = " + hash);
		System.out.println("---------------------------");
		boolean eq = value3.equals(value4);
		System.out.println("value3.equals(value4) = " + eq);
		System.out.println("---------------------------");
		int e = Short.compare(value3, value4);
		System.out.println("compare(value3,value4) = " + e);
		System.out.println("---------------------------");
		int f = value3.compareTo(value4);
		System.out.println("value3.compareTo(value4) = " + f);

		System.out.println("---------------------------");
		short to_rev = 7;
		System.out.println("Short.reverseBytes(to_rev) = " + Short.reverseBytes(to_rev));
	}
}
