package Airlines;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		Ticket ticket = new Ticket(1001, "Khaled", "Riyadh", "Jeddah", 
				LocalDateTime.of(2021, 11, 11, 10, 30));
		
		System.out.println(ticket.getPassenger());
	}

}
