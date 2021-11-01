import java.time.LocalDate;

public class Person {
	String name;
	int national_id;
	LocalDate birthday;
	
	public void print_info() {
		System.out.println(this.name +
				" " + this.national_id);
	}
}
