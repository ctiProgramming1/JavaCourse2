/*
Lecture 11: Polymorphism
	source 1: https://www.w3schools.com/java/java_polymorphism.asp
	source 2: https://harmash.com/java/java-polymorphism/
 */

public class Main {

	public static void main(String[] args) {

		Department p = new Police();
		Department m = new Moror();
		Department f = new FireFighting();
		
		p.start();
		m.start();
		f.start();
		


	}

}
