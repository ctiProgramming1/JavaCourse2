package shop;

public class Product {
	String name;
	String type;
	double price;
	boolean hasTax;
	
	// Constructor
	
	public Product(String n, String t, double p, boolean h) {
		name = n;
		type = t;
		price = p;
		hasTax = h;
	}
	
	double getFinalPrice() {
		if(hasTax)
			return price * 1.15;
		else
			return price;
	}
	
	void printInfo() {
		System.out.println(name + " (" + type + "): $" + getFinalPrice());
	}

}
