
public class SavingsAccount extends Object implements IAccountService{
	
	//instance variables or fields or non-static variables
	int accountNo;
	float balance;
	String status;
	int pin;
	String branch;
	static float interestRate = 3.25f;
	String bankName = "XYZ Bank";
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}	
	
	public SavingsAccount(int accountNo, float balance, String status, int pin, String branch) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.status = status;
		this.pin = pin;
		this.branch = branch;
	}

	
	public static float getInterestRate() {	
		return interestRate;
	}

	//instance method or non-static method
	//withdraw(int)
	public void withdraw(int withdrawalAmount) {
		//business logic
		if(withdrawalAmount <= this.balance) {
			this.balance = this.balance-withdrawalAmount;
		}else {
			System.err.println("U Have Insufficient Funds");
		}
	}

	//withdraw(int,int)
	public void withdraw(int withdrawalAmount,int pin) {
		
		if(this.pin == pin) {
			
			if(withdrawalAmount <= 40000) {
				
				withdraw(withdrawalAmount);
				
			}else {
				System.err.println("Withdrawal limit execeeded");
			}
			
		}else {
			System.err.println("Invalid pin");
		}
		
	}
	
	
	public void deposit(int depositAmount) {
		if(depositAmount > 0) {
			balance = balance + depositAmount;
		}else {
			System.err.println("Invalid deposit amount");
		}
	}
	
	public void getDetails() {
		System.out.println("AccountNo : "+accountNo+" Balance : "+balance);
	}

}
