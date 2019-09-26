package task4;

public class CheckingAccount extends Account{
	double overDraft;
	public CheckingAccount (int id, double balance, double overDraft) {
		this.id = id;
		this.balance = balance;
		this.overDraft = overDraft;	
		System.out.println("Testing Checking Account");
		System.out.println("Your overDraft limit : " + overDraft);
		System.out.println();
	}
	
	public void withdraw(double amount) {
		double newBalance = balance - amount; // -6000
		if(newBalance < 0 && Math.abs(newBalance) > overDraft) {
			System.out.println("You want to withdraw : $" + amount);
			System.out.println("overdraft limit hit");
			System.out.println();
		}else
			this.balance = newBalance;		
	}
	
	public String toStrig() {
		return "Account Id: " + this.getId() + "\n" 
				+ "Current Balance: $" + this.getBalance() + "\n"
				+ "Monthly Interest: " +  this.getMonthlyInterest() + "\n"
				+ "Date Created: " + this.getDateCreated() + "\n" 
				+ "overdraft amount : " + this.overDraft;
	}
	
}
