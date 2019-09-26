package task1;

import java.util.Random; 
import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int numberOfSlots = input.nextInt();

		String[] ballPaths = new String[numberOfBalls];
		int[] slots = new int[numberOfSlots];

		for (int i = 0; i < numberOfBalls; i++) {
			ballPaths[i] = ballPath(slots);
			System.out.printf(ballPaths[i] + "\n");
		}
		input.close();

		// display balls
		System.out.println("");
		displayBall(slots, numberOfBalls);
	}

	// display path
	public static String ballPath(int[] slot) {
		StringBuilder ballPath = new StringBuilder();
		for (int i = 0; i < slot.length - 1; i++) {
			Random random = new Random();
			int n = random.nextInt(2); // 50% chance 0 or 1
			if (n == 0)
				ballPath.append("R");
			else
				ballPath.append("L");
		}
		int position = getBallPosition(ballPath.toString(), 'R');
		slot[position]++;
		return ballPath.toString();

	}

	// counts the number of 'R'
	public static int getBallPosition(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
				// System.out.println(count);
			}
		}
		return count;

	}
	// 8, 5
	public static void displayBall(int[] slots, int numberOfBalls) {
		while (!isEmpty(slots)) {
			if (isRowEmpty(slots, numberOfBalls)) {
				numberOfBalls--;
				continue;
			}
			for (int i = 0; i < slots.length; i++) {
				if (slots[i] >= numberOfBalls) {
					System.out.printf("O");
					slots[i]--;
				} else
					System.out.printf(" ");
			}
			numberOfBalls--;
			System.out.println("");
		}
	}

	public static boolean isEmpty(int[] slots) {
		for (int slot : slots) {
			if (slot != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isRowEmpty(int[] slots, int rowNum) {
		for (int slot : slots) {
			if (slot == rowNum) {
				return false;
			}
		}
		return true;
	}
}
