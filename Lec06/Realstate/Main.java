package Realstate;

public class Main {

	public static void main(String[] args) {
		
		House h1 = new House(200, 2, "White", "Riyadh", 500000);
		
		h1.setPrice(600000);
		System.out.println(h1.getPrice());

	}

}
