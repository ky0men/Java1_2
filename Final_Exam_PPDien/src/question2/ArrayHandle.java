package question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayHandle {

	public static void randomGenerate(int arr[], int max, int min) {
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * ((max - min) + 1)) + min;
		}
		System.out.println("a) The randomly generated array is: " + Arrays.toString(arr));
	}

	public static void primeNumberOfArray(int arr[]) {
		System.out.print("b) Prime number in array is: ");
		ArrayList<Integer> primeList = new ArrayList<>();
		for (int i : arr) {
			if (checkPrime(i) && !primeList.contains(i)) {
				primeList.add(i);
			}
		}
		if (primeList.size() != 0) {
			Collections.sort(primeList);
			System.out.println(primeList.toString().replace("[", "").replace("]", ""));
		} else {
			System.out.print("Array is not contains prime number!\n");
		}
	}

	public static boolean checkPrime(int n) {
		int count = 0;
		boolean result = false;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				if (count > 2) {
					break;
				}
			}
		}
		if (count == 2) {
			result = true;
		}
		return result;
	}

	public static void reverseArray(int arr[]) {
		for (int i = 0; i < 5; i++) {
			int temp = arr[i];
			arr[i] = arr[9 - i];
			arr[9 - i] = temp;
		}
		System.out.println("c) The reversed array is: " + Arrays.toString(arr));
	}

	public static void sortArray(int arr[]) {
		Arrays.sort(arr);
		System.out.println("d) Sorted in ascending array is: " + Arrays.toString(arr));
	}
}
