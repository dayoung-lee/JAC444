//JAC Workdhop1
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
		
		System.out.print("Annual Interest Rate: ");
		double interestRate = input.nextDouble();
		interestRate /= 100.0;
		double monthlyInterestRate = interestRate / 12.0;
		
		System.out.println("");
		input.close();
		
		double monthlyPayment = (balance * monthlyInterestRate) / (1-Math.pow(1 + monthlyInterestRate, -numberOfMonths));
		System.out.println("Montly Payment: " + (String.format("%.2f", monthlyPayment)));
		
		double total = monthlyPayment * 12;
		System.out.println("Total Payment: " + (String.format("%.2f", total) + "\n"));
		
		System.out.println("Payment#" + "\t" + "Interest" + "\t" + "Principal" + "\t" + "Balance");
		
		for (int i = 1; i <= numberOfYears * 12; i++) {
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.println(i + "\t\t" + (String.format("%.2f", interest)) + "\t\t" + (String.format("%.2f", principal))
					+ "\t\t" + (String.format("%.2f", balance)));
		}		
	}
}
