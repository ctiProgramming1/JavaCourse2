package Shape;

public class Shape {
	
	static double pi = 3.14;
	
	static double squareArea(double length) {
		return Math.pow(length, 2);
	}
	
	static double rectangleArea(double length, double width) {
		return length * width;
	}
	
	static double circleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

}
