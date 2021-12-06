
public class CarFactory extends Factory{
	
	int carsPerDay;
	String carsType;
	
	public CarFactory(String name, String location, String carsType, double area, int carsPerDay) {
		super(name, location, area);
		this.carsPerDay = carsPerDay;
		this.carsType = carsType;
	}

	@Override
	public void print_info() {
		System.out.println("Factory name: " + this.name +
						   "\t Cars Type:" + this.carsType);
		
	}
	
	
	

}
