
public class Mammal extends Animal{

	double weight;
	String skin;
	
	public Mammal(String name, String color, String skin, double weight, boolean isCarnivore) {
		super(name, color, isCarnivore);
		this.weight = weight;
		this.skin = skin;
	}

	@Override
	public void print_info() {
		System.out.println("Name: " + this.getName() + " Weight: " + this.weight);
		
	}
	
	
	
	
}
