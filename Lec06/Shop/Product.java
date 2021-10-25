package Shop;

public class Product {
	private int product_id;
	private String name;
	private double price;
	
	public Product(int product_id, String name, double price) {
		this.product_id = product_id;
		this.name = name;
		this.price = price;
	}
	
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}
	
	void setPrice(double price) {
		if(price < 0)
			System.out.println("Error! Wrong price!");
		else
			this.price = price;
	}

}
