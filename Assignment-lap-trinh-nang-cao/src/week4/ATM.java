package week4;

import java.util.Scanner;

public class ATM {

	private static final Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.printf("%nMain menu%n");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
	}

	public static int incorrectId(int id) {
		// Scanner in = new Scanner(System.in);
		while (id < 0 || id > 9) {
			System.out.print("Please enter a valid id: ");
			id = sc.nextInt();
			System.out.println();
		}
		return id;
	}
	
	public static void choice(int id, int choice, Account[] accs) {
		switch (choice) {
		case 1:
			System.out.printf("The balance is %.1f%n", accs[id].getBalance());
			break;
		case 2:
			System.out.print("Enter the amount to withdraw: ");
			accs[id].withdraw(sc.nextDouble());
			break;
		case 3:
			System.out.print("Enter the amount to deposit: ");
			accs[id].deposit(sc.nextDouble());
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		Account[] accs = new Account[10];
		for (int i = 0; i < 10; i++) {
			accs[i] = new Account(i, 0.045);
		}

		System.out.print("Enter an id: ");
		int id = sc.nextInt();

		if (id < 0 || id > 0) {
			id = incorrectId(id);
		}

		while (true) {
			menu();
			System.out.print("Enter a choice: ");
			int choice = sc.nextInt();

			if (choice == 4) {
				System.out.printf("%nEnter an id: ");
				id = sc.nextInt();

				if (id < 0 || id > 9) {
					id = incorrectId(id);
				}
			}
			choice(id, choice, accs);
		}
	}

	
}
