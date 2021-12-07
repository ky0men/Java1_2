package question2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArr[] = new int[10];
		int max, min;
		min = ExceptionInput(sc, "min of array");
		max = ExceptionInput(sc, "max of array");
		ArrayHandle.randomGenerate(intArr, max, min);
		ArrayHandle.primeNumberOfArray(intArr);
		ArrayHandle.reverseArray(intArr);
		ArrayHandle.sortArray(intArr);
	}

	public static int ExceptionInput(Scanner sc, String value) {
		while (true) {
			int n;
			try {
				System.out.print("Input " + value + ": ");
				n = sc.nextInt();
				sc.nextLine();
				return n;
			} catch (Exception e) {
				System.out.println("The entered value is not a integer number. Input again!");
				sc.nextLine();
			}
		}
	}
}
