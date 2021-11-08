package Store;

/*
 source 1: https://harmash.com/java/java-inheritance/
 source 2: https://harmash.com/java/java-overriding/
 source 3: https://harmash.com/java/java-overloading/
 source 4: https://harmash.com/java/java-type-casting/
 */

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Product p1 = new Product(111, "Water", 1);
		Can c1 = new Can(1001, "Foul", 4.5, LocalDate.of(2021,11,10));
		
		c1.print_info();
		
		Mobile iphone13 = new Mobile(20001, "iPhone 13", 5400, true, 24, "Black");
		
		iphone13.print_info();
		
		System.out.println(iphone13 instanceof Mobile);
		System.out.println(p1 instanceof Mobile);
//		
		
		// التحويل في كلا الحالتين لا يقصد منه تحويل نوع الكائن الأصلي بل تخصيص الطريقة التي سيتعامل فيها المترجم مع الكائن
//		// Up-casting
		Product phone = iphone13;
			
		// Down-casting
		Mobile iphoneXR = (Mobile) phone;
		
		System.out.println(iphone13.color);
		System.out.println(iphone13.test());
//		System.out.println(phone.test()); not allowed!
//		System.out.println(phone.color); not allowed!
		System.out.println(iphoneXR.color);
//		
		System.out.println(p1.toString());
		System.out.println(c1.getClass());
		System.out.println(iphone13.getClass());
		System.out.println(phone.getClass());
		System.out.println(iphoneXR.getClass());

		
	}

}
