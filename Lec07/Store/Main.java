package Store;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Product p1 = new Product(111, "Water", 1);
		Can c1 = new Can(1001, "Foul", 4.5, LocalDate.of(2021,11,10));
		
//		c1.print_info();
		
		Mobile iphone13 = new Mobile(20001, "iPhone 13", 5400, true, 24, "Black");
		
		iphone13.print_info();
		
	}

}
