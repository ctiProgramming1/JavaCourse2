public abstract class Animal {
	
	private String name;
	String color;
	boolean isCarnivore;
	
	public Animal(String name, String color, boolean isCarnivore) {
		this.name = name;
		this.color = color;
		this.isCarnivore = isCarnivore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 

	
	public abstract void print_info();
	
}
