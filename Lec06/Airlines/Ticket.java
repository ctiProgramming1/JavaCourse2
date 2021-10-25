/*
 source 1: https://harmash.com/java/java-modifiers/
 source 2: https://harmash.com/java/java-encapsulation/
 */

package Airlines;

import java.time.LocalDateTime;

public class Ticket {
	int number;
	private String passenger;
	LocalDateTime time;
	String from;
	String to;
	
	public Ticket(	int number, String passenger, String from,
			String to, LocalDateTime time) {
		this.number = number;
		this.passenger = passenger;
		this.time = time;
		this.from = from;
		this.to = to;
	}
	
	String getPassenger() {
		return this.passenger;
	}

}
