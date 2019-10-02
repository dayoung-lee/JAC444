package contact;

import java.util.Scanner;

public class contactMain {
	private static final int MAX = 100;
	private static Scanner input = new Scanner(System.in);
	private static contactArray[] contactlist = new contactArray[MAX];
	private static int count = 0;

	public static void main(String[] args) {
		System.out.println("Contact Version 0.1");
		boolean run = true;

		while (run) {
			showMainMenu();
			int menuNo = input.nextInt();
			input.nextLine();

			switch (menuNo) {
			case 0:
				input.close();
				System.out.println("\n--The program has ended--");
				run = false;
				break;
			case 1:
				insertContact();
				break;
			case 2:
				showContact();
				break;
			case 3:
				modifyContact();
				break;
			default:
				System.out.println("Invalid number. Please select between 0 to 3.");
			}// end switch
		} // end while
	}
	
	//menu
	private static void showMainMenu() {
		System.out.println("\n<Choose Menu>");
		System.out.println("-----------------------------");
		System.out.println("1.add|2.show|3.modify|0.Exit|");
		System.out.println("-----------------------------");
		System.out.print("Select: ");
	}
 
	//insert contact
	private static void insertContact() {
		System.out.println("");
		System.out.print("Name: ");
		String name = input.nextLine();

		System.out.print("Phone Number: ");
		String phone = input.nextLine();

		System.out.print("Email: ");
		String email = input.nextLine();

		// create contact instance
		contactArray ct = new contactArray(name, phone, email);
		contactlist[count] = ct;
		count++;
		System.out.println("`" + name + "'" + " is added.");

	}
	
	// show contact
	private static void showContact() {
		if (count == 0) {
			System.out.println("No result.");
		} else {
			System.out.println("---------------------");
			System.out.println("Contact Information: ");
			System.out.println("---------------------");
			for (int i = 0; i < count; i++) {
				
				System.out.println("No." + i);
				contactlist[i].displayInfo();
				System.out.println();
			}
		}
	}

	// modify contact
	private static void modifyContact() {
		if (count == 0) {
			System.out.println("No result.");
		} else {
			System.out.println("Currently, " + count + " is(are) in the list.");
			System.out.print("Choose number that you want to modify: No.");
			int modifyNo = input.nextInt();
			input.nextLine();
			
			if(modifyNo < count) {
				System.out.println("No." + modifyNo);
				contactlist[modifyNo].displayInfo();
				System.out.println();
				System.out.println("Please write name, phone number, email again.");
				
				System.out.print("Name: ");
				String name = input.nextLine();

				System.out.print("Phone Number: ");
				String phone = input.nextLine();

				System.out.print("Email: ");
				String email = input.nextLine();
				contactArray ct = new contactArray(name, phone, email);
				contactlist[modifyNo] = ct;
				System.out.println("The contact is changed.");
			}else
				System.out.println("Invalid numbers.");
		}
	}		
}
