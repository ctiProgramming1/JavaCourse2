package Store;

public class Product {
	int product_id;
	String name;
	double price;
	
	public Product(int product_id, String name, double price) {
		this.product_id = product_id;
		this.name = name;
		this.price = price;
	}
	
	void print_info() {
		System.out.print(this.name + " SAR " + this.price);
	}
	
	// Overloading
	void print_info(int n) {
		System.out.print(this.name + n + " SAR " + this.price);
	}
	
	// Can not override this method
	final String print_product_name(int number) {
		return this.name + number;
	}

	// Can not override this method
	static String print_product_name(int number, int number2) {
		return " " + number;
	}


}
