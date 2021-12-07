package baiTapTrenLop1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QLCB {
	private ArrayList<CanBo> cb = new ArrayList<>();

	public void themMoi() {
		Scanner sc = new Scanner(System.in);
		byte choice;
		do {
			System.out.println("========================================");
			System.out.println("Lua chon loai nhan vien can nhap");
			System.out.println("1. Cong nhan");
			System.out.println("2. Ky su");
			System.out.println("3. Nhan vien");
			System.out.println("4. Thoat");
			choice = ExceptionChoice(sc);
			if (choice == 4) {
				break;
			} else if (choice == 1 || choice == 2 || choice == 3) {
				switch (choice) {
				case 1:
					CongNhan cn = new CongNhan();
					cn.themMoi(sc);
					cb.add(cn);
					break;
				case 2:
					KySu ks = new KySu();
					ks.themMoi(sc);
					cb.add(ks);
					break;
				case 3:
					NhanVien nv = new NhanVien();
					nv.themMoi(sc);
					cb.add(nv);
				default:
					break;
				}
			} else {
				System.out.println("Lua chon khong hop le. Xin hay nhap lai!");
			}
		} while (true);
	}

	public void xuatThongTin() {
		System.out.println("----------Thong tin nhan vien------------");
		for (CanBo canBo : cb) {
			if (canBo instanceof CongNhan) {
				((CongNhan) canBo).xuatThongTin();
			} else if (canBo instanceof KySu) {
				((KySu) canBo).xuatThongTin();
			} else if (canBo instanceof NhanVien) {
				((NhanVien) canBo).xuatThongTin();
			}
		}
	}

	public void timKiemTheoTen(Scanner sc) {
		String tenCanTim;
		System.out.print("Nhap ho va ten nhan vien can tim: ");
		tenCanTim = sc.nextLine();
		ArrayList<CanBo> timCanbo = new ArrayList<>();
		for (CanBo canBo : cb) {
			if (canBo.getHoTen().equalsIgnoreCase(tenCanTim)) {
				timCanbo.add(canBo);
			}
		}
		if (timCanbo.size() != 0) {
			System.out.println("===================================================================");
			System.out.println("Nhan vien duoc tim thay: ");
			for (CanBo canBo : timCanbo) {
				canBo.xuatThongTin();
			}
			System.out.println("\n===================================================================");
		} else {
			System.out.println("Khong tim thay nhan vien " + tenCanTim + " trong danh sach.");
		}
	}

	public static byte ExceptionChoice(Scanner sc) {
		while (true) {
			byte choice;
			try {
				System.out.print("Lua chon: ");
				choice = sc.nextByte();
				sc.nextLine();
				return choice;
			} catch (InputMismatchException e) {
				System.out.println("Lua chon khong hop le. Chon lai!");
				sc.nextLine();
			}
		}
	}

}
