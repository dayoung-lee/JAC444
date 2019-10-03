package studentInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class studentInfo {
	private static final int MAX = 100;
	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Student> list = new ArrayList<Student>();
	private static int count = 0;

	public static void main(String[] args) {
		boolean run = true;
		System.out.println("Student Information");
		Student st1 = new Student("Dayoung Lee", "1693162");
		Student st2 = new Student("Nayoung Kim", "13293162");
		Student st3 = new Student("John Doe", "1223162");

		list.add(st1);
		list.add(st2);
		list.add(st3);

		System.out.println();

		int listSize = list.size();
		System.out.println(listSize + " students are in the list.");

		while (run) {
			showMainMenu();
			int menu = scan.nextInt();
			scan.nextLine();
			switch (menu) {
			case 1:
				addStudent();
				break;
			case 2:
				searchStudent();
				break;
			case 3:
				System.out.println("\nStudent's List: ");
				showList();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				System.out.println("--End of the program--");
				System.exit(0);
			default:
				System.out.println("Invalid number.Try again");
			}
		}
	}

	private static void modifyStudent() {
		System.out.println("-------------------------");
		showList();
		System.out.println("-------------------------");
		boolean run = true;
		while (run) {
			System.out.print("Please type index number: ");
			int indexNo = scan.nextInt();
			if (indexNo < list.size()) {
				System.out.println();
				System.out.println("No." + indexNo);
				list.get(indexNo).displayInfo();
				System.out.println();
				scan.nextLine();

				System.out.println("Please write name and student's number again.");
				System.out.print("name: ");
				String newName = scan.nextLine();
				System.out.print("number: ");
				String newNo = scan.nextLine();
				Student st = new Student(newName, newNo);
				list.set(indexNo, st);
				System.out.println("`" + newName + "'s information" + " has changed.");
				break;
			} else
				System.out.println("Invalid number");
		}
	}

	private static void showList() {
		for (Student stu : list) {
			System.out.println("No." + list.indexOf(stu) + " " + stu.getName() + " " + stu.getNo());
		}
	}

	private static void searchStudent() {
		boolean run = true;
		while (run) {
			if (true) {
				System.out.print("Type student's name: ");
				String name = scan.nextLine();
				boolean flag = false;
				for (Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println(name + "'s student no: " + stu.getNo());
						flag = true;
					}
				} // end for
				if (!flag)
					System.out.println("Can't find " + name + " student.");
			}

			System.out.print("Search (y) Back to menu (n) ");
			String input = scan.next();
			scan.nextLine();
			if (input.equals("n")) {
				break;
			}
		} // end while
		System.out.println("");
	}

	private static void addStudent() {
		System.out.println();
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Student's number: ");
		String no = scan.nextLine();

		Student st = new Student(name, no);
		list.add(st);
		for (Student stu : list) {
			System.out.println("No." + list.indexOf(stu) + " " + stu.getName() + " " + stu.getNo());
		}
		System.out.println("\n'" + name + "' is added.\n");

	}

	private static void showMainMenu() {
		System.out.println("-------------------------------------");
		System.out.println("1.Add|2.Search|3.List|4.Modify|5.Exit");
		System.out.println("-------------------------------------");
		System.out.print("Selecet: ");
	}
}
