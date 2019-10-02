package simpleConversion;

import java.util.Scanner;

public class calculate {
	private static Scanner sc = new Scanner(System.in);
	private static boolean run = true;

	public static void main(String[] args) {
		while(run) {
			showMainMenu();
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				mAndy();
				break;
			case 2:
				cAndf();
				break;
			case 3:
				fandk();
				break;
			case 4:
				sc.close();
				System.out.println("\n--The program has ended--");
				run = false;
				break;
			default:
				System.out.println("Invalid number. Try again.");
			}
		} // end while
	}// end main

	private static void fandk() {
		boolean run1 = true;
		while (run1) {
			System.out.println("------------------------");
			System.out.println("1. Found to Kg");
			System.out.println("2. Kg to Found");
			System.out.println("3. Back to main menu");
			System.out.print("Choose number: ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("Found(lb): ");
				double found = sc.nextDouble();
				System.out.println("Result: " + found + " found(lb) to " + (found/2.205) + " kg.\n");
				break;
			case 2:
				System.out.print("Kg: ");
				double kg = sc.nextDouble();
				System.out.println("Result: " + kg + " kg to " + (kg*2.205)+ " found(lb).\n");
				break;
			case 3:
				run1 =false;
				break;
			default:
				System.out.println("Invalid Number. Try again.");
				System.out.println();
			}
		}
	}

	private static void cAndf() {
		boolean run1 = true;
		while (run1) {
			System.out.println("------------------------");
			System.out.println("1. Celsius to Fahrenheit");
			System.out.println("2. Fahrenheit to Celsius");
			System.out.println("3. Back to main menu");
			System.out.print("Choose number: ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("Celsius: ");
				double c = sc.nextDouble();
				System.out.println("Result: " + c + " c to " + (c * 9 / 5) + 32 + " f.\n");
				break;
			case 2:
				System.out.print("Fahrenheit: ");
				double f = sc.nextDouble();
				System.out.println("Result: " + f + " f to " + (f - 32) * 5 / 9 + " c.\n");
				break;
			case 3:
				run1 =false;
				break;
			default:
				System.out.println("Invalid Number. Try again.");
				System.out.println();
			}
		}
	}	

	private static void mAndy() {
		boolean run1 = true;
		while (run1) {
			System.out.println("------------------------");
			System.out.println("1. Meter to Yard");
			System.out.println("2. Yard to Meter");
			System.out.println("3. Back to main menu");
			System.out.print("Choose number: ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("Meter: ");
				double meter = sc.nextDouble();
				System.out.println("Result: " + meter + " meter to " + (1.094 * meter) + " yard.\n");
				break;
			case 2:
				System.out.print("Yard: ");
				double yard = sc.nextDouble();
				System.out.println("Result: " + yard + " yard to " + (yard / 1.094) + " meter.\n");
				break;
			case 3:
				run1 =false;
				break;
			default:
				System.out.println("Invalid Number. Try again.");
				System.out.println();
			}
			
			/*
			 * if(menu < 1 && menu > 2) { System.out.println("Invalid Number."); }else
			 * if(menu == 1){ double meter = sc.nextDouble(); System.out.println(meter +
			 * "Meter to " + (1.094*meter) + "Yard."); }else { double yard =
			 * sc.nextDouble(); System.out.println(yard + "Yard to " + (yard/1.094)
			 * +"Meter." ); }
			 */
		}
	}
	
	private static void showMainMenu() {
		System.out.println("-----Conversion Program-----\n");
		System.out.println("1.Meter-Yard  2.Celsius-Fahrenheit 3.Found-Kg 4.Exit");
		System.out.print("Select: ");
	}
}// end class
