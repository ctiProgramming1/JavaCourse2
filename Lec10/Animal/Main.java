
public class Main {

	public static void main(String[] args) {

		Mammal cat = new Mammal("Cat", "Black", "whoop", 20, true);
		
		Bird dove = new Bird("Dove", "White", "Asia", false, true);
		
		cat.print_info();
		dove.print_info();

	}

}
