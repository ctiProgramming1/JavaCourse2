package shop;

public class Product {
	String name;
	String type;
	double price;
	boolean hasTax;
	static double tax_rate = 0.15;
	
	// Constructor	
	public Product(String name, String type, double price, boolean hasTax) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.hasTax = hasTax;
	}
		
	static void print_me() {
		System.out.println("Static method!");
	}
	
	double getFinalPrice() {
		if(this.hasTax)
			return this.price * 1.15;
		else
			return this.price;
	}
	
	void printInfo() {
		System.out.println(name + " (" + this.type + "): $" + getFinalPrice());
	}

}
