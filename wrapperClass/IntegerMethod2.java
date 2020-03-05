package wrapperClass;

public class IntegerMethod2 {
	public static void main(String args[]) {
		int value1 = 55;
		String value2 = "45";

		// Construct two Integer objects
		Integer value3 = new Integer(value1);
		Integer value4 = new Integer(value2);

		System.out.println("bytevalue(x) = " + value3.byteValue());
		System.out.println("shortvalue(x) = " + value3.shortValue());
		System.out.println("intvalue(x) = " + value3.intValue());
		System.out.println("longvalue(x) = " + value3.longValue());
		System.out.println("doublevalue(x) = " + value3.doubleValue());
		System.out.println("floatvalue(x) = " + value3.floatValue());
		System.out.println("-----------------------");

		int value = 45;
		// reverse() can be used to reverse order of bits
		// reverseytes() can be used to reverse order of bytes
		System.out.println("Integer.reverse(value)=" + Integer.reverse(value));
		System.out.println("Integer.reverseBytes(value)=" + Integer.reverseBytes(value));
		System.out.println("-----------------------");
		// signum() returns -1,0,1 for negative,0 and positive
		// values
		System.out.println("Integer.signum(value)=" + Integer.signum(value));
		System.out.println("-----------------------");
		// hashcode() returns hashcode of the object
		int hash = value3.hashCode();
		System.out.println("hashcode(value3) = " + hash);
		System.out.println("-----------------------");
		// equals returns boolean value representing equality
		boolean eq = value3.equals(value4);
		System.out.println("value3.equals(value4) = " + eq);
		System.out.println("-----------------------");
		// compare() used for comparing two int values
		int e = Integer.compare(value3, value4);
		System.out.println("compare(value3,value4) = " + e);
		System.out.println("-----------------------");
		// compareTo() used for comparing this value with some
		// other value
		int f = value3.compareTo(value4);
		System.out.println("value3.compareTo(value4) = " + f);
	}
}