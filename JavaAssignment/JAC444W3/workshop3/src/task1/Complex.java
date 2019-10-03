package task1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
// import java.util.Objects;
import java.util.Scanner;

public class Complex {
	public final double a; // real part
	public final double b; // imaginary part

	public Complex() {
		a = 0;
		b = 0;
	}

	public Complex(double a) {
		this.a = a;
		b = 0;
	}

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		if (b == 0)
			return a + "";
		if (a == 0)
			return a + " + " + b + "i";
		if (b < 0)
			return a + " - " + (-b) + "i";
		return a + " + " + b + "i";
	}

	public Complex add(Complex b1) {
		Complex a1 = this;
		double a = a1.a + b1.a;
		double b = a1.b + b1.b;
		return new Complex(a, b);
	}

	public Complex subtract(Complex b1) {
		Complex a1 = this;
		double a = a1.a - b1.a;
		double b = a1.b - b1.b;
		return new Complex(a, b);
	}

	public Complex multiply(Complex b1) {
		Complex a1 = this;
		double a = a1.a * b1.a - a1.b * b1.b;
		double b = a1.a * b1.b + a1.b * b1.a;
		return new Complex(a, b);
	}

	public Complex reciprocal() {
		double scale = a * a + b * b;
		return new Complex(a / scale, -b / scale);
	}

	public Complex divide(Complex b1) {
		Complex a1 = this;
		Complex a2 = a1.multiply(b1.reciprocal());
		return a2;
	}

	public double abs() {
		return Math.hypot(a, b);
	}

	public double getRe() {
		return this.a;
	}

	public double getIm() {
		return this.b;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// NumberFormat formatter = new DecimalFormat("#0.00");

		System.out.print("Enter the first complex number: ");
		while (!input.hasNextDouble()) {
			System.out.println("\nErrors! Try again.");
			System.out.print("Enter the first complex number: ");
			input.nextLine();
		}
		double x = input.nextDouble();
		double y = input.nextDouble();
		Complex z1 = new Complex(x, y);

		System.out.print("Enter the second complex number: ");
		while (!input.hasNextDouble()) {
			System.out.println("\nErrors! Try again.");
			System.out.print("Enter the second complex number: ");
			input.nextLine();
		}
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		Complex z2 = new Complex(x1, y1);
		
		input.close();
		
		Complex add1 = z1.add(z2);
		Complex sub1 = z1.subtract(z2);
		Complex mul1 = z1.multiply(z2);
		Complex div1 = z1.divide(z2);
		double abs1 = z1.abs();

		System.out.println("(" + z1.toString() + ") +" + " (" + z2.toString() + ") = " + add1.toString());
		System.out.println("(" + z1.toString() + ") -" + " (" + z2.toString() + ") = " + sub1.toString());
		System.out.println("(" + z1.toString() + ") *" + " (" + z2.toString() + ") = " + mul1.toString());
		System.out.println("(" + z1.toString() + ") /" + " (" + z2.toString() + ") = " + div1.toString());
		System.out.println("|(" + z1.toString() + ")|" + " = " + abs1);
	}
}
