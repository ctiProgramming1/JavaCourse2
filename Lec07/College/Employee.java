
public class Employee extends Person{
	
	public Employee(String name, int national_id, int employee_id, double salary) {
		super(name, national_id);
		this.employee_id = employee_id;
		this.salary = salary;
	}

	int employee_id;
	double salary;
	
	void raise() {
		this.salary *= 1.2;
	}
	
	@Override
	public void print_info() {
		super.print_info();
		System.out.println(" SAR " + this.salary);
	}
}
