package Education;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		School s1 = new School("Alamjad", "Riyadh", false, 200,
				LocalDate.of(2000, 10, 10));
		
		s1.name = "Almjad 2";
		s1.city = "Jeddah";
		s1.isGov = true;
		
		System.out.println(s1.name);
		System.out.println(s1.city);
		System.out.println(s1.getTotal());
		System.out.println(s1.isGov);
		System.out.println(s1.estabilshed);

	}

}
