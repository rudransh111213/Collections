
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JuniorSavingsAccount account = new JuniorSavingsAccount();
		
		account.accountNo = 101;
		account.balance = 5000;
		account.branch = "MTN";
		account.pin = 1234;
		account.status = "active";
		account.guardianName = "Hary";
		
		
		account.withdraw(2000,1234);
		
		account.getDetails();
		
	}

}
