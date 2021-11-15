package College;

import java.time.LocalDate;

public abstract class Person {
	String name;
	int national_id;
	LocalDate birthday;
	
	public Person(String name, int national_id) {
		this.name = name;
		this.national_id = national_id;
	}
	
	public abstract void print_info();
	
	public abstract String getName();
	
}
