package Lec01;

/* 
Lecture 1: Methods

source 1: https://harmash.com/java/java-methods/
source 2: https://www.w3schools.com/java/java_methods.asp
*/

public class Class1 {
	
	public static void greeting(String name, int age) {
		
		if(age >= 18)		
			System.out.println("Hello! " + name);
		else
			System.out.println("Access denied!");
	}
	
	private static int add(int n1, int n2) {
		return (n1+n2);
	}

	private static double add(double n1, double n2) {
		return (n1+n2);
	}
	
	private static int add(int n1, int n2, int n3) {
		return (n1+n2+n3);
	}


	public char getGrade(int grade) {	
		char result = 'N';
		
		if(grade > 100 || grade < 0) {
			System.out.println("Error: the number wrong!!");
			result = 'N';
			int a = 9;
		}
		
		else if(grade >= 90) 
			result = 'A';
		
		else if(grade >= 80)
			result = 'B';
		
		else if(grade >= 70)
			result = 'C';
		
		else if(grade >= 60)
			result = 'D';
		
		else 
			result = 'F';
		
		System.out.println(result);
//		System.out.print(a);
		return result;
		}

	public static void main(String[] args) {
		
//		greeting("Ali", 15);

//		System.out.println("The sum is " + add(553,598));
		
		Class1 obj1 = new Class1();		
		
//		System.out.println(result);
		
		System.out.println("The grade is " + obj1.getGrade(88));
	}

}