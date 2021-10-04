package Bank;

public class Account {
	int account_number;
	String account_holder; 
	double balance;
	int national_id;
	boolean  isActive;
	
	static double transfer_fee = 2.0;
	
	public Account(	int account_number, String account_holder,
					int national_id, boolean  isActive) {
		this.account_number = account_number;
		this.account_holder = account_holder;
		this.national_id = national_id;
		this.isActive = isActive;
	}
	
	void account_info() {
		System.out.println(this.account_holder + " " + this.account_number + ": SAR " + this.balance);
	}
	
	void deposite(double amount) {
		this.balance += amount;
	}
	
	void withdrow(double amount) {
		this.balance -= amount;
	}
	

}
