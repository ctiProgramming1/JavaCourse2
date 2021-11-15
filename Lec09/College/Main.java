/*
 source: https://harmash.com/java/java-abstraction/
 */

package College;


public class Main {

	public static void main(String[] args) {
		
		// Error: Cannot instantiate the type Person
		// Because Person class is abstract
		//Person p1 = new Person("Khaled", 111);
		
		Student student1 = new Student("Ahmed", 112200511, 1134541, "Networks");
		
		student1.print_info();
		
		Employee employee1 = new Employee("Ali", 1122112221, 5241, 5000);
		
		employee1.raise();
		
		employee1.print_info();
		
		System.out.println(student1.getName());
		System.out.println(employee1.getName());

	}

}
