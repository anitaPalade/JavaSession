package Interface;
//Interface declaration: by first user  
interface Drawable{  
	void draw();  
}  
//Implementation: by second user  
class Square implements Drawable{  
	public void draw(){
		System.out.println("drawing Square");
	}  
}  
class Eclipse implements Drawable{  
	public void draw(){
		System.out.println("drawing Eclipse");
	}  
}  
//Using interface: by third user  
class TestInterface{  
	public static void main(String args[]){  
		Drawable square=new Square(); 
		square.draw();  
		Drawable eclipse=new Eclipse();
		eclipse.draw();  
	}
}  