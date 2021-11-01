
public class Student extends Person {
	
	int student_id;
	String major;

	public Student(String name, int national_id, int student_id, String major) {
		super(name, national_id);
		this.student_id = student_id;
		this.major = major;
	}
	
	@Override
	public void print_info() {
		super.print_info();
		System.out.println(" - " + this.major);
	}
}
