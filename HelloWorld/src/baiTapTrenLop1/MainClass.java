package baiTapTrenLop1;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		byte choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n========== Quan ly nhan vien ============");
			System.out.println("1. Them can bo moi");
			System.out.println("2. Tim kiem can bo theo ho ten");
			System.out.println("3. Hien thi danh sach can bo");
			System.out.println("4. Thoat");
			choice = QLCB.ExceptionChoice(sc);
			if (choice == 4) {
				break;
			} else if (choice == 1 || choice == 2 || choice == 3) {
				switch (choice) {
				case 1:
					qlcb.themMoi();
					break;
				case 2:
					qlcb.timKiemTheoTen(sc);
					break;
				case 3:
					qlcb.xuatThongTin();
					break;
				default:

					break;
				}

			} else {
				System.out.println("Lua chon khong dung. Nhap lai!");
			}
		} while (true);
	}
}
