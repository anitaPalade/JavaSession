class Man{
	void perform() {
		System.out.println("Performs his job");   //Method Overridding
	}
}
class Teacher extends Man{
	void perform() {
		System.out.println("Teaches");
	}
}
class Driver extends Man{
	void display() {
		System.out.println("Drives");
	}
}
public class MethodOverridding {
public static void main(String args[]) {
	Man manObj1 = new Man();             //calls perform method of parent class Man
	manObj1.perform();
	Man manObj2 = new Teacher();        //Calls perform method of class Teacher
	manObj2.perform();
	Driver manObj3 = new Driver();     //Calls perform method of class Man because perform is not present in this class but it extends the parent class which has perform method
	manObj3.perform();
	manObj3.display();
}
}
