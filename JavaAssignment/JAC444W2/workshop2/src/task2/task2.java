package task2;

import java.util.Scanner;

public class task2 {
	static final int ID = 0;
	static final int LOAN = 1;
	static double[][][] mBanks;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of banks: ");
		int numOfBank = input.nextInt();
		System.out.print("Minimum asset limit: ");
		int minAsset = input.nextInt(); 
		
		mBanks = new double[numOfBank][][];

		for (int i = 0; i < mBanks.length; i++) {
			System.out.println("Enter bank # " + i);
			System.out.print("Balance: ");
			double balance = input.nextDouble();
			System.out.print("Number of banks Loaned: ");
			int numBanks = input.nextInt();

			mBanks[i] = new double[++numBanks][2];
			mBanks[i][0][0] = balance; // banks balance

			for (int bank = 1; bank < mBanks[i].length; bank++) {
				System.out.print("Bank Id: ");
				mBanks[i][bank][ID] = input.nextDouble();
				System.out.print("Amount: ");
				mBanks[i][bank][LOAN] = input.nextDouble();
			}
			System.out.println("-- Bank #" + i + " --" + "\n");
		}
		System.out.println("");
		displayMatrix(mBanks);
		
		boolean[] unsafeIndex = scanBanks(mBanks, minAsset);
		String string = "";
		
		System.out.println();
		for (int i = 0; i < unsafeIndex.length; i++) {
			if (unsafeIndex[i] == true) {			
				string += " ";
				string += i;
			}			
		}
		
		System.out.println("Unsafe banks :" + string);
	}

	public static boolean[] scanBanks(double[][][] m, int limit) {
		boolean[] indexUnsafeBanks = new boolean[m.length];
		double total;
		boolean isSafe = false;
		while (!isSafe) {
			isSafe = true;
			for (int banks = 0; banks < m.length; banks++) {
				total = m[banks][0][0];
				for (int LoanedBanks = 1; LoanedBanks < m[banks].length; LoanedBanks++) {
					int index = (int) m[banks][LoanedBanks][ID];
					if (!indexUnsafeBanks[index])
						total += m[banks][LoanedBanks][LOAN];
				}
				if (total < limit && !indexUnsafeBanks[banks]) {
					indexUnsafeBanks[banks] = true;
					isSafe = false;
				}
			}
		}
		return indexUnsafeBanks;
	}

	public static void displayMatrix(double[][][] m) {	
		System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", "bank # |", "balance |", "Loaned# |", "Bank ID |",
				"Amounts |", "Bank ID |", "Amounts |");
		for (int banks = 0; banks < m.length; banks++) {
			System.out.printf("%-7d|%8.2f|%-8d|", banks, m[banks][0][0], m[banks].length - 1);
			for (int LoanedBanks = 1; LoanedBanks < m[banks].length; LoanedBanks++) {
				System.out.printf("%-8.0f|%8.2f|", m[banks][LoanedBanks][ID], m[banks][LoanedBanks][LOAN]);
			}
			System.out.println();
		}
	}
}
