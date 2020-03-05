package wrapperClass;

public class DoubleClassMethods {

	public static void main(String[] args) {

		double value1 = 55.05;
		String value2 = "95";

		// Construct two Double objects
		Double x = new Double(value1);
		Double y = new Double(value2);

		// toString()
		System.out.println("toString(value1) = " + Double.toString(value1));
		System.out.println("----------------------------");
		// valueOf()
		// return Double object
		Double z = Double.valueOf(value2);
		System.out.println("valueOf(value1) = " + z);
		z = Double.valueOf(value2);
		System.out.println("ValueOf(value2) = " + z);
		System.out.println("----------------------------");
		// parseDouble()
		// return primitive double value
		double zz = Double.parseDouble(value2);
		System.out.println("parseDouble(value2) = " + zz);
		System.out.println("----------------------------");
		System.out.println("bytevalue(x) = " + x.byteValue());
		System.out.println("shortvalue(x) = " + x.shortValue());
		System.out.println("intvalue(x) = " + x.intValue());
		System.out.println("longvalue(x) = " + x.longValue());
		System.out.println("doublevalue(x) = " + x.doubleValue());
		System.out.println("floatvalue(x) = " + x.floatValue());
		System.out.println("----------------------------");
		int hash = x.hashCode();
		System.out.println("hashcode(x) = " + hash);
		System.out.println("----------------------------");
		boolean eq = x.equals(y);
		System.out.println("x.equals(y) = " + eq);
		System.out.println("----------------------------");
		int e = Double.compare(x, y);
		System.out.println("compare(x,y) = " + e);

		int f = x.compareTo(y);
		System.out.println("x.compareTo(y) = " + f);
		System.out.println("----------------------------");
		Double d = Double.valueOf("1010.54789654123654");
		System.out.println("isNaN(d) = " + d.isNaN());
		System.out.println("----------------------------");
		double dd = 10245.21452;
		System.out.println("Double.toString(dd) = " + Double.toHexString(dd));

		long double_to_long = Double.doubleToLongBits(dd);
		System.out.println("Double.doubleToLongBits(dd) = " + double_to_long);

		double long_to_double = Double.longBitsToDouble(double_to_long);
		System.out.println("Double.LongBitsToDouble(double_to_long) = " + long_to_double);
	}
}
