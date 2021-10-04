package Bank;

public class Main {

	public static void main(String[] args) {
		Account ali_account = new Account(10001,"Ali", 1110, true);
		Account saad_account = new Account(10002,"Saad", 1112, true);
		
		ali_account.deposite(200);
		ali_account.deposite(23);
		ali_account.deposite(500.50);
		
		saad_account.deposite(300);
		saad_account.deposite(100);
		saad_account.deposite(50);
		
		saad_account.withdrow(70);
		
		ali_account.account_info();
		saad_account.account_info();
	}

}
