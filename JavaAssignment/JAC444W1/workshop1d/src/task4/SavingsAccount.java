package task4;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int id, double balance) {
		super (id, balance);
		System.out.println("Testing Savings Account");
		System.out.println("Your current balance : " + balance);		
	}
	
	public void withdraw(double amount) {
		System.out.println("You want to waithdraw : " + amount);
		System.out.println();
		if(this.balance < amount) {
			System.out.println("Cannot overdraw");
		}else{
			this.balance -= amount;
		}
	}	
}
