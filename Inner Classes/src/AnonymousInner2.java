interface Eatable{
 void eat();
}

class AnonymousInner2{
 public static void main(String args[]){
 
 Eatable e=new Eatable(){
  public void eat()
  	{
	  System.out.println("nice fruits");
	 }
 	};
 
 	e.eat();
 }
}
