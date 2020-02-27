abstract class Person{
	abstract void eat();
}

public class AnonymousInner {
	public static void main(String[] args) {
		Person obj = new Person() {
			public void eat(){
				System.out.println("Fruits");
			}
		};
		
		obj.eat();
	}
}
