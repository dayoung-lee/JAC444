package task2;
import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
    	
	// no-argument constructor
	public Account () {		
		dateCreated = new Date();
	}
	
	// constructor with id, initial balance
	public Account (int id, double balance) {
		this(); // call no-argument constructor
		this.id = id;
		this.balance = balance;		
	}
	
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}		
	
	// The mutator methods for id, balance, and annualInterestRate.
	// to control changes to a variable.
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate (double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	// 	The accessor method to return the value of a private field.
	public Date getDateCreated() {
		return dateCreated;
	}	
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate / 100;
	}
	
	public double getMontlyInterestRate() {
		return getAnnualInterestRate() / 12;
	}

	public double getMonthlyInterest() {
		return balance * getMontlyInterestRate();
	}
	
	// withdraw & deposit
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	
}
