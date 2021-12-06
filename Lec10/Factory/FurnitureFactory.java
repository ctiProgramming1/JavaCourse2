
public class FurnitureFactory extends Factory {
	
	String type;
	String materials;
	
	public FurnitureFactory(String name, String location, String type, String materials, double area) {
		super(name, location, area);
		this.type = type;
		this.materials = materials;
	}

	@Override
	public void print_info() {
		System.out.println("Factory name: " + this.name +
				   "\t Materials:" + this.materials);
		
	}
	
	

}
