package task1;

import java.util.Date;

public class Account implements java.io.Serializable {
	private int pin;
	
	private int id = 0;
	String firstName = "";
	String lastName = "";
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Account() {
	}

	public Account(int id, double balance) {
		this(); // no-argument constructor
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}
	
	// The accessor and mutator methods for id, balance, and annualInterestRate.
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated = new Date();
	}

	public double getAnnualInterestRate() {
		return this.annualInterestRate / 100;
	}

	public double getMonthlyInterestRate() {
		return getAnnualInterestRate() / 12;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	@Override
	public String toString() {
		return "Account Id: " + this.getId() + "\n" + "Current Balance: $" + this.getBalance() + "\n"
				+ "Name: " + this.firstName + " " + this.lastName + "\n" + "Date Created: " + this.getDateCreated() + "\n";
	}

}
