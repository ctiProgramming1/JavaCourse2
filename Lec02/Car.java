package Lec02;

public class Car {
	
	String make;
	String model;
	int year;
	String color;
	boolean HasAWD;
	boolean HasHydraulic;
	
	void printInfo() {
		System.out.print(year + " " + make + " " + model + " ");
		System.out.print("Features: ");
		if(HasAWD) System.out.print("4x4-AWD ");
		if(HasHydraulic) System.out.print("Hydraulic");
		System.out.println();
	}
	
	void AddHydraulic() {
		if(!HasHydraulic)
			HasHydraulic = true;
	}
	

}
