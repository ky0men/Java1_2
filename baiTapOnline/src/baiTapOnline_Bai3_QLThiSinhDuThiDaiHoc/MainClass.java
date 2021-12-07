package baiTapOnline_Bai3_QLThiSinhDuThiDaiHoc;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		TuyenSinh tuyenSinh = new TuyenSinh();
		do {
			System.out.println("========== Quan ly thi sinh du thi ============");
			System.out.println("1. Them moi thi sinh");
			System.out.println("2. Hien thi thong tin thi sinh");
			System.out.println("3. Tim kiem theo so bao danh");
			System.out.println("4. Thoat");
			choice = ThiSinh.ExceptionInteger(sc, "Lua chon");
			switch (choice) {
			case 1:
				tuyenSinh.themMoi(sc);
				break;
			case 2:
				tuyenSinh.hienThiThongTin();
				break;
			case 3:
				tuyenSinh.timKiemTheoSBD(sc);
				break;
			case 4:
				System.out.println("Bye Bye...");
				break;
			default:
				System.out.println("Lua chon khong dung. Nhap lai!");
				break;
			}
		} while (choice != 4);
	}
}
