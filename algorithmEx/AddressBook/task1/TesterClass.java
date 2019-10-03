package task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import task1.Account;

public class TesterClass {
	public static void main(String[] args) {
		String fileName = "account.dat";
		Scanner input = new Scanner(System.in);

		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		// name field
		accounts[0].firstName = "Dayoung";
		accounts[0].lastName = "Lee";
		
		accounts[1].firstName = "Sohail";
		accounts[1].lastName = "Love";
		
		accounts[2].firstName = "Beauden";
		accounts[2].lastName = "Bender";
		
		accounts[3].firstName = "Bethan";
		accounts[3].lastName = "Mcgee";
		
		accounts[4].firstName = "Caolan";
		accounts[4].lastName = "Clegg";
		
		accounts[5].firstName = "Brendon";
		accounts[5].lastName = "Coles";
		
		accounts[6].firstName = "Denzel";
		accounts[6].lastName = "Reyes";
		
		accounts[7].firstName = "Randy";
		accounts[7].lastName = "Atkinson";
		
		accounts[8].firstName = "Santino";
		accounts[8].lastName = "Barron";
		
		accounts[9].firstName = "Maheen";
		accounts[9].lastName = "Kline";
		
		System.out.println("Account details...");
		for (Account a : accounts) {
			
			a.setAnnualInterestRate(4.5);
			System.out.print("ID: " + a.getId());
			System.out.print("\tAnnual Interest Rate: " + a.getAnnualInterestRate());
			System.out.print("\tBalance: " + a.getBalance());
			System.out.println("\tName: " + a.firstName + a.lastName);
			
		}

		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(accounts);
			out.close();
			file.close();
			System.out.println("Serialized data is saved.");

		} catch (IOException i) {
			i.printStackTrace();
		}

		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			accounts = (Account[])in.readObject();
			in.close();
			file.close();
		

		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
		for(int i = 0; i < accounts.length; i++) {System.out.println(accounts[i].toString());}
		
	}
}