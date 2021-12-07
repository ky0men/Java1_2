package question4;

import java.util.Stack;

public class ExStack {
	public static void StringReverserThroughStack(String str) {
		Stack<Character> charOfString = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			charOfString.push(str.charAt(i));
		}
		System.out.println("String after reverser is: ");
		while (!charOfString.isEmpty()) {
			System.out.print(charOfString.pop());
		}
	}
}
