package wrapperClass;

//Java program to illustrate 
//various float class methods 
//of Java.lang class 
public class FloatClassMethods {

	public static void main(String[] args) {
		float value1 = 55.05F;
		String value2 = "45";

		// Construct two Float objects
		Float value3 = new Float(value1);
		Float value4 = new Float(value2);

		// toString()
		System.out.println("toString(value1) = " + Float.toString(value1));
		System.out.println("-------------------------");
		// valueOf()
		// return Float object
		Float z = Float.valueOf(value1);
		System.out.println("valueOf(value1) = " + z);
		z = Float.valueOf(value2);
		System.out.println("ValueOf(value2) = " + z);
		System.out.println("-------------------------");
		// parseFloat()
		// return primitive float value
		float zz = Float.parseFloat(value2);
		System.out.println("parseFloat(value2) = " + zz);
		System.out.println("-------------------------");
		System.out.println("bytevalue(value3) = " + value3.byteValue());
		System.out.println("shortvalue(value3) = " + value3.shortValue());
		System.out.println("intvalue(value3) = " + value3.intValue());
		System.out.println("longvalue(value3) = " + value3.longValue());
		System.out.println("doublevalue(value3) = " + value3.doubleValue());
		System.out.println("floatvalue(value3) = " + value3.floatValue());
		System.out.println("-------------------------");
		int hash = value3.hashCode();
		System.out.println("hashcode(value3) = " + hash);
		System.out.println("-------------------------");
		boolean eq = value3.equals(value4);
		System.out.println("value3.equals(value4) = " + eq);
		System.out.println("-------------------------");
		int e = Float.compare(value3, value4);
		System.out.println("compare(value3,value4) = " + e);

		int f = value3.compareTo(value4);
		System.out.println("value3.compareTo(value4) = " + f);
		System.out.println("-------------------------");
		Float d = Float.valueOf("1010.54789654123654");
		System.out.println("isNaN(d) = " + d.isNaN());

		System.out.println("Float.isNaN(45.12452) = " + Float.isNaN(45.12452F));
		System.out.println("-------------------------");
	
		float dd = 10245.21452F;
		System.out.println("Float.toString(dd) = " + Float.toHexString(dd));

		int float_to_int = Float.floatToIntBits(dd);
		System.out.println("Float.floatToLongBits(dd) = " + float_to_int);

		float int_to_float = Float.intBitsToFloat(float_to_int);
		System.out.println("Float.intBitsToFloat(float_to_long) = " + int_to_float);
	}

}
