package interestCalculate;

import java.util.Scanner;

public class interestCalculate {
	private static double balance = 0;
	private static double rate = 0;
	private static double interest = 0;
	private static int year =0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Balance: ");
		balance = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Rate: ");
		rate = sc.nextDouble();
		interest = rate * 0.001;
		interest = Double.parseDouble(String.format("%.4f", interest));
		sc.nextLine();
		System.out.println(interest);
		
		
		System.out.print("The number of year(s): ");
		year = sc.nextInt();		
		showResult();		
	}

	private static void showResult() {
		double newBalance = balance;
		System.out.println("--------------------");
		System.out.println("Balance: " + balance);
		for(int y=1; y<= year; y++) {
			double cal = (newBalance*(1+interest*year));			
			System.out.println("After " + y + " year(s), your blance : " + String.format("%.2f",  cal) + ".");	
			newBalance = (cal - balance) + balance;
			
		}		
	}
}
