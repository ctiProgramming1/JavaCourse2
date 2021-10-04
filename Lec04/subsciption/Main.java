package Subsciption;

public class Main {

	public static void main(String[] args) {

		Subscription kids = new Subscription("Kids",30,"1",false);
		Subscription adults = new Subscription("Adults",50,"1",true);
		
		kids.subDetails();
		adults.subDetails();

	}

}
