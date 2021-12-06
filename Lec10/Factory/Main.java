
public class Main {

	public static void main(String[] args) {
		CarFactory ford = new CarFactory("Ford car factory LMT.", "USA",
										"Pick-up Trucks", 2000, 10);
		FurnitureFactory almutlaq = new FurnitureFactory("Almutalq Co.",
										"Riyadh, Saudi Arabia", "sofa","Wood", 2000);
		
		ford.print_info();
		almutlaq.print_info();

	}

}
