package College;


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
		System.out.print(this.name +
				" " + this.national_id);
		System.out.println(" - " + this.major);
	}
	
	@Override
	public String getName() {
		return "Student Name: " + this.name;		
	}
}
