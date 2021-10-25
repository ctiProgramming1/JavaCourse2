package Shop;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product(1001, "iPhone 12", 3000);
		
		p1.setPrice(1000);
		p1.product_id = -1002;
		
		System.out.println(p1.name + " - " + p1.product_id + 
								": SAR " + p1.getPrice());

	}

}
