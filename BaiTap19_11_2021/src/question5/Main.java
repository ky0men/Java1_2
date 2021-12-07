package question5;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> inputString = new Stack<>();
		myPush("An", inputString);
		myPush("Hoa", inputString);
		myPush("Nga", inputString);
		myPush("Hoang", inputString);
		myPush("Bach", inputString);
		while (inputString.size() != 0) {
			System.out.println(myPop(inputString));
		}
	}

	public static void myPush(String str, Stack<String> newStr) {
		newStr.add(str);

	}

	public static String myPop(Stack<String> newStr) {
		String result = newStr.get(newStr.size() - 1);
		newStr.remove(newStr.size() - 1);
		return result;
	}
}
