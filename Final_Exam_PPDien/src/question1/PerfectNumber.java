package question1;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("------------- Check perfect number program-------------");
		do {
			n = ExceptionNumber(sc);
			if (n < 0) {
				System.out.println("The entered number is negative number. Please input the positive number!");
			}

		} while (n < 0);

		if (checkPerfectNumber(n)) {
			System.out.println("Yes! Number " + n + " is perfect number.");
		} else {
			System.out.println("No! Number " + n + " is not perfect number.");
		}
	}

	public static int ExceptionNumber(Scanner sc) {
		while (true) {
			int n;
			try {
				System.out.print("Input positive integer number to check: ");
				n = sc.nextInt();
				sc.nextLine();
				return n;
			} catch (Exception e) {
				System.out.println("The entered number is invalid. Input again!");
				sc.nextLine();
			}
		}
	}

	public static boolean checkPerfectNumber(int n) {
		int sum = 0;
		boolean result = false;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			result = true;
		}
		return result;
	}
}
