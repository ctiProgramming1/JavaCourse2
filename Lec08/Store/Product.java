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

	void print_info(String title) {
		System.out.print(title +this.name + " SAR " + this.price);
	}


}
