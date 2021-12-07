package baiTapTrenLop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CongNhan extends CanBo {
	private byte capBac;

	public CongNhan() {
		this.chucVu = "Cong Nhan";
	}

	public CongNhan(String hoTen, byte tuoi, String gioiTinh, String diaChi, String chucVu, byte capBac) {
		super();
		this.capBac = capBac;
	}

	public void themMoi(Scanner sc) {
		super.themMoi(sc);
		setCapBac(ExceptionCapBac(sc));
	}

	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print(", Cap Bac: " + this.getCapBac());
	}

	public static byte ExceptionCapBac(Scanner sc) {
		while (true) {
			byte capBac;
			try {
				System.out.println("Nhap cap bac (1 - 10): ");
				capBac = sc.nextByte();
				sc.nextLine();
				return capBac;
			} catch (InputMismatchException e) {
				System.out.println("Cap bac khong hop le. Nhap lai!");
				sc.nextLine();
			}
		}
	}

	public byte getCapBac() {
		return capBac;
	}

	public void setCapBac(byte capBac) {
		if (capBac <= 10 && capBac >= 1) {
			this.capBac = capBac;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Cap bac khong hop le. Nhap lai!");
			setCapBac(ExceptionCapBac(sc));
		}
	}
}
