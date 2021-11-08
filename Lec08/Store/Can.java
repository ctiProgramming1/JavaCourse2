package Store;

import java.time.LocalDate;

public class Can extends Product{
	public Can(int product_id, String name, double price, LocalDate expiration) {
		super(product_id, name, price);
		this.expiration = expiration;
	}

	LocalDate expiration;
	
	@Override
	void print_info() {
		super.print_info();
		System.out.println(" Expire on:" + this.expiration);
	}
}
