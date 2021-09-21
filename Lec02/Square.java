package Lec02;

public class Square {
	
	double length;
	String color;
	
	void printInfo(){
		System.out.println("Length is " + length);
		System.out.println("Area is " + getArea());
		System.out.println("Color is " + color);
	}
	
	double getArea() {
		return Math.pow(length, 2);
	}

}
