/*
 source 1: https://harmash.com/java/java-modifiers/
 source 2: https://harmash.com/java/java-encapsulation/
 */

package Realstate;

public class House {
	double area;
	int floors;
	String color;
	String city;
	private double price;
	
	public House(double area, int floors, String color,
	String city, double price) {
		this.area = area;
		this.floors = floors;
		this.color = color;
		this.city = city;
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		if(price < 100000)
			System.out.println("Wrong price!");
		else
			this.price = price;
	}
	
}
