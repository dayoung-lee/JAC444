//JAC Workshop1
//Name : Dayoung Lee 
//Student ID : 121693162
//Date : 15/JAN/2019

package lab1_3;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double balance = input.nextDouble();

		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		int numberOfMonths = numberOfYears * 12;
		System.out.println("Number of Months for " + numberOfYears + " year(s) = " + numberOfMonths + " month(s) \n");

		System.out.print("Annual Interest Rate: ");
		double interestRate = input.nextDouble();
		interestRate /= 100.0;
		double monthlyInterestRate = interestRate / 12.0;
		System.out.println("monthly Interest Rate: " + monthlyInterestRate);

		System.out.println("");
		input.close();
		
		// loan payment formula
		double monthlyPayment = (monthlyInterestRate * balance)
				/ (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));
		// System.out.println("Monthly Payment: " + (String.format("%.2f",
		// monthlyPayment))); -- 865.27
		System.out.println("Monthly Payment: " + (Math.floor((monthlyPayment) * 100) / 100.0));

		double total = monthlyPayment * 12;
		System.out.println("Total Payment for (" + numberOfYears + " year(s)) : " + (String.format("%.2f", total) + "\n"));
		
		// display
		System.out.println("Payment#" + "\t" + "Interest" + "\t" + "Principal" + "\t" + "Balance");
		for (int i = 1; i <= numberOfYears * 12; i++) {
			double monthlyInterest = monthlyInterestRate * balance;
			double principal = monthlyPayment - monthlyInterest;
			balance = balance - principal;
			if (i != numberOfMonths) {
				System.out.println(i + "\t\t" + (String.format("%.2f", monthlyInterest)) + "\t\t"
						+ (String.format("%.2f", principal)) + "\t\t" + (String.format("%.2f", balance)));
			} else if (i == numberOfMonths) {
				if (balance <= monthlyPayment) {
					System.out.println("\n-- Last Payment -- Your Balance : " + (String.format("%.2f", balance)) + ".");
					balance = monthlyPayment + balance;
					System.out.println(i + "\t\t" + (String.format("%.2f", monthlyInterest)) + "\t\t"
							+ (String.format("%.2f", principal)) + "\t\t" + (String.format("%.2f", balance)));
				} else {
					System.out.println(i + "\t\t" + (String.format("%.2f", monthlyInterest)) + "\t\t"
							+ (String.format("%.2f", principal)) + "\t\t" + (String.format("%.2f", balance)));
				}
			}
		}
	}
}
