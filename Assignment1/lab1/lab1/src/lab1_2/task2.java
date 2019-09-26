//JAC Workshop1
//Name : Dayoung Lee 
//Student ID : 121693162
//Date : 15/JAN/2019

package lab1_2;
import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: (e.g., 2012): ");
		while(!input.hasNextInt()) {			
			System.out.println("\nError. Try again. ");
			System.out.print("Enter year: (e.g., 2012): ");
			input.next();
		}
		
		int k = input.nextInt(); // year
		k = k % 100;
		
		System.out.print("Enter month: 1-12: ");		
		while(!input.hasNextInt()) {			
			System.out.println("\nError. Try again. ");
			System.out.print("Enter month: 1-12: ");
			input.next();
		}		
		int m = input.nextInt(); // month
		
		while(m < 1 || m > 12) {
			System.out.println("Error. Try again.(1-12): ");
			m = input.nextInt();
		}
		
		if (m == 1) {
			m = 13;
			k--;
		}
		if (m == 2) {
			m = 14;
			k--;
		}
		
		System.out.print("Enter the day of the month(1-31): ");		
		while(!input.hasNextInt()) {			
			System.out.println("\nError. Try again. ");
			System.out.print("Enter the day of the month(1-31): ");
			input.next();
		}
		
		int q = input.nextInt(); // day
		while(q < 1 || q > 31) {
			System.out.print("Invalid numbers. Try again.(1-31): ");
			q = input.nextInt();
		}
		input.close(); 
		
		int j = k / 100; // century
		// Zeller’s congruence formula
		int h = q + 26*(m + 1) / 10 + k + k /4 + j /4 + 5* j;
		h = h % 7;
		
		System.out.print("Day of the week is ");		
		switch(h) {
			case 0 : System.out.print("Saturday.");
				break;
			case 1 : System.out.print("Sunday.");
				break;
			case 2 : System.out.print("Monday.");
				break;
			case 3 : System.out.print("Tuesday.");
				break;
			case 4 : System.out.print("Wednesday.");
				break;
			case 5 : System.out.print("Thursday.");
				break;
			case 6 : System.out.print("Friday.");
				break;
		}
	}
}
