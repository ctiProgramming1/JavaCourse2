
public class Employee extends Person{
	
	int employee_id;
	double salary;
	
	void raise() {
		this.salary *= 1.2;
	}
	
	@Override
	public void print_info() {
		System.out.println(this.name + " " + this.national_id + " SAR " + this.salary);
	}
}
