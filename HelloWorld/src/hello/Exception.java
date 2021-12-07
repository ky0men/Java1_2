package hello;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	public void div(int a, int b) {
		int sum = a/ b;
		System.out.println("a/b: " + sum);
	}
	public static void checkOdd(int a, int b) {
		int sub = a -b;
		if(sub % 2 != 0) {
			System.out.println("a - b la so le");
		}else {
			System.out.println("a - b la so chan");
		}
	}
	public static void main(String[] args) {
		Exception ex = new Exception();
		int a = 0, b = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhap a: ");
			a = sc.nextInt();
			System.out.print("Nhap b: ");
			b = sc.nextInt();
			ex.div(a, b);
		}catch (ArithmeticException e) {
			System.out.println("khong the chia cho 0");
		}catch (InputMismatchException e) {
			System.out.println("a hoac b khong phai la so");
		}finally {
			checkOdd(a, b);
		}
		sc.close();
	}
}
