// JAC444 Workshop1
//  Name: Dayoung Lee     Student ID: 121693162      Date: 1/10/2018

package task3;

import java.util.Scanner;

import task3.Account;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int accountId = 10;
		double w = 0;
		double d = 0;
		// Account account = new Account(1122, 20000);

		Account[] accountArray = new Account[10];
		// accountArray[0]~~~[9]

		for (int i = 0; i < 10; i++) {
			accountArray[i] = new Account(i, 100);
		}

		while (true) {
			// create ten accounts with $100
			System.out.print("Enter an id: "); // 2

			while (true) {
				if (!scan.hasNextInt()) {
					System.out.println("Please type again.");
					scan.next();
				} else {
					accountId = scan.nextInt(); // accountId = 2
					if (accountId < 0 || accountId > 9) {
						System.out.println("Please type again. (0 ~ 9)");
					} else {
						// System.out.println("User id:" + accountId);
						// System.out.println();
						break;
					}
				}
			}

			Account a = accountArray[accountId]; //

			scan = new Scanner(System.in);
			while (true) {
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");

				System.out.print("Enter a choice: ");

				int choice = 0;

				while (true) {
					if (!scan.hasNextInt()) {
						System.out.println("Please type again.");
						scan.next();
					} else {
						choice = scan.nextInt();						
						if (choice < 1 || choice > 4) {
							System.out.println("Please type again. (1 ~ 4)");
						} else {
							break;
						}
					}
				}
				switch (choice) {
				case 1:
					System.out.println("The balance is " + a.getBalance() + "\n");
					break;
				case 2:
					System.out.print("Enter an amount to withdraw: ");
					w = scan.nextInt();
					if (a.getBalance() > w) {
						a.withdraw(w);
						System.out.println();
						break;
					} else{
						System.out.println("Overdraft limit hit");
						System.out.println();
						break;
					}
				case 3:
					System.out.print("Enter an amount to deposit: ");
					d = scan.nextInt();
					a.deposit(d);
					System.out.println();
					break;

				}// switch
				if (choice == 4) {					
					System.out.println();
					System.out.println("--End of the program--");
					System.exit(0);
				}
			}

		}
	}
}
