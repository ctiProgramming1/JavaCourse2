/*
 source 1: https://harmash.com/java/java-modifiers/
 source 2: https://harmash.com/java/java-encapsulation/
 */

package Hospital;

import java.time.LocalDate;

public class Patient {
	int file_number;
	String name;
	private LocalDate birthday;
	char gender;
	boolean isUrgent;
	
	public Patient(	int file_number, String name,
	 char gender, boolean isUrgent , LocalDate birthday) {
		this.file_number = file_number;
		this.name = name;
		this.gender = gender;
		this.isUrgent = isUrgent;
		this.birthday = birthday;
	}
	
	LocalDate getBirthday() {
		return this.birthday;
	}
	
	void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

}
