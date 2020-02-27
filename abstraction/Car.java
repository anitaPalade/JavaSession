package abstraction;

abstract class Ford{
	   abstract void run();
}

class Car extends Ford{
	 void run(){
		 System.out.println("running safely");
	 }

	 public static void main(String args[]){
	  Ford obj = new Car();
	  obj.run();
	 }
}
