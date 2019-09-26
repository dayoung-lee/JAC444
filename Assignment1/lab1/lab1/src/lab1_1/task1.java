//JAC Workshop1
//Name : Dayoung Lee 
//Student ID : 121693162
//Date : 15/JAN/2019

package lab1_1;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		double a, b, c, d, e, f;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f : ");
		while (true) {
			try {
				a = input.nextDouble();
				b = input.nextDouble();
				c = input.nextDouble();
				d = input.nextDouble();
				e = input.nextDouble();
				f = input.nextDouble();

				double a1 = (e * d) - (b * f);
				double a2 = (a * d) - (b * c);

				double b1 = (a * f) - (e * c);
				double b2 = (a * d) - (b * c);

				double x = a1 / a2;
				double y = b1 / b2;

				// display
				System.out.println("\nYour input : ");
				System.out.println(a + "x + " + b + "y = " + e);
				System.out.println(c + "x + " + d + "y = " + f + "\n");

				if (a2 == 0 || b2 == 0) {
					System.out.print("The equation has no solution");
				} else {
					System.out.print("x is " + x + " and y is " + y);
				}
			} catch (Exception e1) {
				System.out.println("\nTry again.");
				System.out.print("Enter a, b, c, d, e, f : ");
				input.nextLine();
			}
		}
	}
}

