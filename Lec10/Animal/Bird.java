
public class Bird extends Animal{
	
	boolean canFly;
	String inhabitant;
	
	public Bird(String name, String color, String inhabitant,boolean isCarnivore, boolean canFly) {
		super(name, color, isCarnivore);
		this.canFly = canFly;
		this.inhabitant = inhabitant;
	}

	@Override
	public void print_info() {
		System.out.println("Name: " + this.getName() + " Can Fly: " + this.fly_string());
		
	}

	public String fly_string() {
		if(this.canFly)
			return "Yes";
		else
			return "No";
	}
	
	
	
	
	

}
