class JuniorSavingsAccount extends SavingsAccount{

	
	String guardianName;
	
	void process() {
		
	}
	
	@Override
	public void withdraw(int withdrawalAmount, int pin) {
		
		if(this.pin == pin) {
			
			if(withdrawalAmount <= 10000) {
				
				withdraw(withdrawalAmount);
				
			}else {
				System.err.println("Withdrawal limit execeeded");
			}
			
		}else {
			System.err.println("Invalid pin");
		}
		
		
	}
	
}
