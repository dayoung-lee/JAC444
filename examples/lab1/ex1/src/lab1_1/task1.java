//JAC Workdhop1
//Name : Dayoung Lee 
//Student ID : 121693162
//Date : 15/JAN/2019

package lab1_1;
import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		
		while(!input.hasNextDouble()) {			
			System.out.println("Error. Try again.");
			System.out.print("Enter a, b, c, d, e, f: ");
			input.next();
		} // if user input not double value 
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		input.close();
		
		double a1 = (e*d)-(b*f);
		double a2 = (a*d)-(b*c);
				
		double b1 = (a*f)-(e*c);
		double b2 = (a*d)-(b*c);
		
		double x, y;
		
		x = a1 / a2;
		y = b1/ b2;
		
		if(a2 == 0 || b2 == 0) {
				System.out.print("The equation has no solution");
			}else{
				System.out.print("x is " + x + " and y is " + y);
		}		
	}
}
