package Interface;

interface Drawables{  
	void draw();  
	static int perimeter(int x, int y){
		return 2*(x+y);
	}  
}  

class Rectangles implements Drawables{  
	public void draw(){
		System.out.println("drawing rectangle");
	}  
}  
  
class InterfaceStaticMethod{  
	public static void main(String args[]){  
		Drawables d=new Rectangles();  
		d.draw();  
		System.out.println(Drawables.perimeter(5,6));  
	}
}  