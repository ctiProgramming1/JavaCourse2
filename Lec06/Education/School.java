package Education;

import java.time.LocalDate;

public class School {
	String name;
	String city;
	boolean isGov;
	private int total_students;
	LocalDate estabilshed;
	
	public School(String name, String city, boolean isGov,
	int total_students, LocalDate estabilshed) {
		this.name =name;
		this.city = city;
		this.isGov = isGov;
		this.total_students = total_students;
		this.estabilshed = estabilshed;
	}
	
	int getTotal() {
		return this.total_students;
	}

}
