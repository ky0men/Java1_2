package baiTapTrenLop01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int n = 0;
		while (flag) {
			try {
				System.out.print("Nhap so tu nhien bat ky: ");
				n = sc.nextInt();
				CheckInput.checkInput(n);
				flag = false;
			} catch (EqualZero e) {
			} catch (LessThanZero e) {
			} catch (LessThanTen e) {
			}
		}
		separateNumber(n);
	}

	public static void separateNumber(int n) {
		ArrayList<Integer> listInt = new ArrayList<>();
		while (n > 0) {
			int i = n % 10;
			n /= 10;
			listInt.add(i);
		}
		Collections.reverse(listInt);
		System.out.println(listInt.toString().replace("[", "").replace("]", ""));
	}
}
