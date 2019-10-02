package forloopEx1;

import java.util.Scanner;

public class forloopEx1 {
	public static void main(String[] args) {
		System.out.print("Input: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}// end for i
	}
}
