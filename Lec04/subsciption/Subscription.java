package Subsciption;

public class Subscription {
	
	String type;
	double price;
	String duration;
	boolean autoRenewal;
	
	public Subscription(String type, double price, String duration, boolean autoRenewal) {
		this.type = type;
		this.price = price;
		this.duration = duration;
		this.autoRenewal = autoRenewal;
	}
	
	void subDetails() {
		System.out.println(this.type + ": SAR " + price);
	}
	
	

}
