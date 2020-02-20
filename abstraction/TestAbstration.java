package abstraction;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("drawing circle");
	}
}

class TestAbstration{
	public static void main(String args[]){
		Shape circle=new Circle();		
		circle.draw();
		Shape reactangle=new Rectangle();
		reactangle.draw();
	}
}
