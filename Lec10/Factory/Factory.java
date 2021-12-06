
public abstract class Factory {
	
	String name;
	private String location;
	double area;

	public Factory(String name, String location, double area) {
		this.name = name;
		this.location = location;
		this.area = area;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public abstract void print_info();
	
}
