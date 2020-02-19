class Area{
	double calculateArea(double radius) {
		System.out.println("Area of circle= " + 3.14*radius*radius);
		return radius;
	}
	int calculateArea(int side) {
		System.out.println("Area of square= " + side*side);
		return side;
	}
	void calculateArea(int height,int base) {
		System.out.println("Area of Triangle = " + 0.5*height*base);
	}
}
public class Overloading {
public static void main(String args[]) {
	Area area = new Area();
	area.calculateArea(3.1);
	area.calculateArea(5);
	area.calculateArea(23, 34);
}
}
