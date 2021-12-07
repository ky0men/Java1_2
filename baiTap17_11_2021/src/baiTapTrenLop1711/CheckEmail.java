package baiTapTrenLop1711;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
	public static boolean checkEmailValid(String email) {
		Pattern pattern = Pattern.compile("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}

	public static void main(String[] args) {
		String inputEmail;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.print("Input your email: ");
			inputEmail = sc.nextLine();
			if (checkEmailValid(inputEmail)) {
				flag = false;
				System.out.println("Congratulation! Your email is: " + inputEmail);
			} else {
				System.out.println("The entered email is not valid! Input again.");
			}
		}
		sc.close();
	}
}
