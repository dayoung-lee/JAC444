// JAC444 Workshop1
//  Name: Dayoung Lee     Student ID: 121693162      Date: 1/10/2018

package task2;

public class Main {
	public static void main(String[] args) {		
		Account account = new Account(1122, 20000);
		System.out.println("Account ID: " + account.getId());
			
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500.0);
		account.deposit(3000.0);
		
		System.out.println("Current Balance: $" + account.getBalance());
	    System.out.println("Monthly Interest: " + account.getMonthlyInterest());
	    System.out.println("Date Created: " + account.getDateCreated());
	}	
}


