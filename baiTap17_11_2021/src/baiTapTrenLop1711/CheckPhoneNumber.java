package baiTapTrenLop1711;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
	public static boolean checkPhoneNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile("^([0]{1}|(\\+84))[35978]\\d{8}$");
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.find();
	}

	public static void main(String[] args) {
		String inputPhone;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.print("Input your phone number: ");
			inputPhone = sc.nextLine();
			if (checkPhoneNumber(inputPhone)) {
				flag = false;
				System.out.println("Congratulation! Your phone number is: " + inputPhone);
			} else {
				System.out.println("The entered phone number is not valid! Input again.");
			}
		}
		sc.close();
	}
}
