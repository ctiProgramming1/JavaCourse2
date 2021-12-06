/*
Lecture 11: Polymorphism
	source 1: https://www.w3schools.com/java/java_polymorphism.asp
	source 2: https://harmash.com/java/java-polymorphism/
 */

public class Main {

	public static void main(String[] args) {
		
		Vehicle c = new Car();
		Vehicle p = new Plane();
		Vehicle s = new Ship();
		
		c.move();
		p.move();
		s.move();

	}

}
