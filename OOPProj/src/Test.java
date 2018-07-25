
public class Test extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount account = new SavingsAccount(101,5000,"active",1234,"MTN");  
		
//		account.accountNo = 101;
//		account.balance = 5000;
//		account.pin = 1234;
//		account.status = "active";
//		account.branch = "MTN";
	
		SavingsAccount account2 = new SavingsAccount(102,10000,"active",2345,"MTN");
		
		account.withdraw(2000);
		
		account.getDetails();
		
		account2.withdraw(1000);
		
		System.out.println("InterestRate : "+SavingsAccount.getInterestRate());

	}

}

