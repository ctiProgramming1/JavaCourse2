package shop;

public class Main {

	public static void main(String[] args) {

		Product p1 = new Product("iPhone13","Electronics", 999, true);
		Product p2 = new Product("Tomato", "Vegetables", 2, false);
		
		p1.printInfo();
		p2.printInfo();

	}

}
