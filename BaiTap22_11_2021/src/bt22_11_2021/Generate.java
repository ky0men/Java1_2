package bt22_11_2021;

import java.util.Scanner;

class Array<E> {
	private final Object[] arr;

	public Array(int length) {
		arr = new Object[length];
	}

	E get(int index) {
		return (E) arr[index];
	}

	void set(int index, E e) {
		arr[index] = e;
	}
}

public class Generate {
	public static <E extends Number> void sumArray(Array<E> inputArray, int length) {
		double sum = 0;
		try {
			for (int i = 0; i < length; i++) {
				sum += Double.parseDouble(String.valueOf(inputArray.get(i)));
			}
			System.out.println("\nSum of array is: " + sum + "\n");

		} catch (Exception e) {
			System.out.println("\nString can not sum!");
		}
	}

	public static <E> void displayArray(Array<E> inputArray, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(" " + inputArray.get(i));
		}
	}

	public static <E> void inputArr(int length, Array<E> arr, Scanner sc) {
		for (int i = 0; i < length; i++) {
			System.out.printf("Input element %d of array: ", i + 1);
			arr.set(i, (E) sc.nextLine());
		}
	}

	public static void main(String[] args) {
		int n, choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input length of array: ");
		n = sc.nextInt();
		sc.nextLine();
		Array<Integer> intArr = new Array(n);
		inputArr(n, intArr, sc);
		System.out.print("The entered array is: ");
		displayArray(intArr, n);
		sumArray(intArr, n);

	}
}
