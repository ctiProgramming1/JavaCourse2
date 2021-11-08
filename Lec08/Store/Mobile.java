package Store;

public class Mobile extends ElectronicDevice{
	
	String color;	
	
	public Mobile(int product_id, String name, double price, 
			boolean hasWarranty, int warranty_duration, String color) {
		super(product_id, name, price, hasWarranty, warranty_duration);
		this.color = color;
	}


	
	@Override
	void print_info() {
		super.print_info();
		if(this.hasWarranty)
			System.out.print(", Warranty: " + this.warranty_duration + " months");
		System.out.println(", " + this.color);
	}
	
	String test() {
		return "test";
	}

}
