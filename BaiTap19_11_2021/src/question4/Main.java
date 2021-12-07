package question4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String inputString;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the string to reverser: ");
		inputString = sc.nextLine();
		ExStack.StringReverserThroughStack(inputString);
		sc.close();
	}
}
