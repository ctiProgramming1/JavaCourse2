package Hospital;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Patient p1 = new Patient(1001, "Ali", 'm', false, 
				LocalDate.of(2000, 10, 20));
				
		System.out.println(p1.getBirthday());
		
		p1.setBirthday(LocalDate.of(2000, 5, 5));
		
		System.out.println(p1.getBirthday());
		

	}

}
