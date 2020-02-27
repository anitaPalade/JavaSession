
public class Student {
	private int studentId;
	private String studentName;
	Student(){
		//Default Constructor
	  studentId = 101;
	  studentName = "Jack";
	}
	Student(int id,String name){
		//Parameterized Constructor
		studentId = id;
		studentName = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
public static void main(String args[]) {
	Student obj1 = new Student();
	System.out.println("Student Name = " + obj1.getStudentName() + " Student id = " + obj1.getStudentId());
	Student obj2 = new Student(102,"Nancy");
	System.out.println("Student Name = " + obj2.getStudentName() + " Student id = " + obj2.getStudentId());
	}
}
