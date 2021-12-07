package question3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookManagement docManage = new BookManagement();
		byte choice;
		do {
			System.out.println("\n================= Document Management Program ================");
			System.out.println("1. Add new document");
			System.out.println("2. Delete document by code");
			System.out.println("3. Display information about document");
			System.out.println("4. Seach document by type");
			System.out.println("5. Exit");
			choice = BookManagement.ExceptionChoice(sc);
			switch (choice) {
			case 1:
				docManage.addNew();
				break;
			case 2:
				docManage.deleteDocByCode(sc);
				break;
			case 3:
				docManage.outputInfo();
				break;
			case 4:
				docManage.searchDocByType(sc);
				break;
			case 5:
				System.out.println("Good Bye!!!!");
				break;
			default:
				System.out.println("Choose is not valid. Choose again!");
				break;
			}
		} while (choice != 5);

	}
}
