package baiTapOnline_Bai2_QuanLyThuVien;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLyTaiLieu qltl = new QuanLyTaiLieu();
		byte choice;
		do {
			System.out.println("\n================= Quan ly tai lieu ================");
			System.out.println("1. Them moi tai lieu");
			System.out.println("2. Xoa tai lieu theo ma");
			System.out.println("3. Hien thong tin tai lieu");
			System.out.println("4. Tim kiem theo loai tai lieu");
			System.out.println("5. Thoat");
			choice = QuanLyTaiLieu.ExceptionChoice(sc);
			if (choice == 5) {
				break;
			} else if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
				switch (choice) {
				case 1:
					qltl.themMoi();
					break;
				case 2:
					qltl.xoaTaiLieuTheoMa(sc);
					break;
				case 3:
					qltl.xuatThongTin();
					break;
				case 4:
					qltl.timTheoLoaiTaiLieu(sc);
					break;

				default:
					break;
				}
			}
		} while (true);

	}
}
