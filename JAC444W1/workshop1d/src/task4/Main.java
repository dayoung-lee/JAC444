// JAC444 Workshop1
//  Name: Dayoung Lee     Student ID: 121693162      Date: 1/10/2018

package task4;

public class Main {
	public static void main(String[] args) {		
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500.0);
		account.deposit(3000.0);
		
		System.out.println(account.toString());
		System.out.println();
		
	    // CheckingAccount account1
	    CheckingAccount account1 = new CheckingAccount(1, 20000, 5000);
	    account1.setAnnualInterestRate(4.5);	    
	    account1.withdraw(26000.0);
	    
	    System.out.println(account1.toString());
		System.out.println();		
	    
	    // SavingAccount account2
	    SavingsAccount account2 = new SavingsAccount(2, 20000);
	    account2.withdraw(19000.0);
	    account2.setAnnualInterestRate(4.5);	    		
		
		System.out.println(account2.toString());		
		
	}	
}


