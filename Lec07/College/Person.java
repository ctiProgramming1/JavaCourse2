import java.time.LocalDate;

public class Person {
	String name;
	int national_id;
	LocalDate birthday;
	
	public Person(String name, int national_id) {
		this.name = name;
		this.national_id = national_id;
	}
	
	public void print_info() {
		System.out.print(this.name +
				" " + this.national_id);
	}
	
}
