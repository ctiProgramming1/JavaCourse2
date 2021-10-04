package college;

public class Student {
	String name;
	String major;
	int id;
	int age;
	
	public Student(String n, int a) {
		name = n;
		age = a;
	}
	
	public Student(String n, String m, int i, int a) {
		name = n;
		major = m;
		id = i;
		age = a;
	}
	
	void printInfo() {
		System.out.println(name + " (" + age + " years)");
		System.out.println("Student ID:" + id);
		System.out.println("Major:" + major);
	}
	
	void changeMajor(String newMajor) {
		major = newMajor;
	}
}
