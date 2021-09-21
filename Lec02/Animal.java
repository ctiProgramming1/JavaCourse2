package Lec02;

public class Animal {
	
	String name;
	String kind;
	double length;
	boolean hasFins;
	
	String getSize() {
		if(length > 100)
			return "Large";
		else
			return "Small";
	}
	
	void printInfo() {
		System.out.println("This " + name + " is " + kind + " and " + getSize());
	}

}
