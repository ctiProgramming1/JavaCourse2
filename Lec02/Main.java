package Lec02;

/*
Lecture 02: Class & Object

source 1: https://harmash.com/java/java-class-and-object/
*/

public class Main {

	public static void main(String[] args) {
		
		// Animal Class		
		
		Animal c = new Animal();
		Animal e = new Animal();
		
		
		c.name = "Cat";
		c.kind = "Mammal";
		c.length = 50;
		c.hasFins = false;
		
		c.printInfo();
		
		e.name = "Elephant";
		e.length = 900;
		e.kind = "Mammal";
		e.hasFins = false;
		System.out.println(e.name);
		
		e.printInfo();
		
		
		// Square Class
		
		Square a = new Square();
		
		a.length = 5.0;
		a.color = "red";
		
		System.out.println(a.getArea());
		
		a.printInfo();
		
		Square b = new Square();
		b.color = "blue";
		b.length = 9.5;
		
		Square d = b;
				
		b.printInfo();
		
		Square r;
		r = new Square();
	
		// Car Class
		
		Car saadCar = new Car();
		saadCar.year = 2023;
		saadCar.make = "Toyota";
		saadCar.model = "Rav4";
		saadCar.color = "White";
		saadCar.HasAWD = true;
		saadCar.HasHydraulic = false;
		
		saadCar.printInfo();
		
		saadCar.AddHydraulic();
		
		saadCar.printInfo();
		
	}

}
