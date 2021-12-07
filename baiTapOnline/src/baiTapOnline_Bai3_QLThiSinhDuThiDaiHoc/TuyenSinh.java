package baiTapOnline_Bai3_QLThiSinhDuThiDaiHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	ArrayList<ThiSinh> thiSinhList;

	public TuyenSinh() {
		thiSinhList = new ArrayList<>();
	}

	public void themMoi(Scanner sc) {
		int choice;
		ThiSinh khoiA, khoiB, khoiC;
		khoiA = new ThiSinhKhoiA();
		khoiB = new ThiSinhKhoiB();
		khoiC = new ThiSinhKhoiC();
		do {
			System.out.println("-------- Them moi thi sinh --------");
			System.out.println("Chon khoi thi cua thi sinh");
			System.out.println("1. Khoi A");
			System.out.println("2. Khoi B");
			System.out.println("3. Khoi C");
			System.out.println("4. Thoat");
			choice = ThiSinh.ExceptionInteger(sc, "Lua chon");
			switch (choice) {
			case 1:
				khoiA.themMoi(sc);
				thiSinhList.add(khoiA);
				break;
			case 2:
				khoiB.themMoi(sc);
				thiSinhList.add(khoiB);
				break;
			case 3:
				khoiC.themMoi(sc);
				thiSinhList.add(khoiC);
				break;
			case 4:
				break;
			default:
				System.out.println("Lua chon khong hop le. Nhap lai!");
				break;
			}
		} while (choice != 4);
	}

	public void hienThiThongTin() {
		for (ThiSinh thiSinh : thiSinhList) {
			if (thiSinh instanceof ThiSinhKhoiA) {
				((ThiSinhKhoiA) thiSinh).hienThiThongTin();
			} else if (thiSinh instanceof ThiSinhKhoiB) {
				((ThiSinhKhoiB) thiSinh).hienThiThongTin();
			} else if (thiSinh instanceof ThiSinhKhoiC) {
				((ThiSinhKhoiC) thiSinh).hienThiThongTin();
			}
		}
	}

	public void timKiemTheoSBD(Scanner sc) {
		int sbd;
		System.out.println("-------- Tim kiem thi sinh ---------");
		sbd = ThiSinh.ExceptionInteger(sc, "so bao danh can tim");
		int sbdFound = 0;
		for (ThiSinh thiSinh : thiSinhList) {
			if (thiSinh.getSoBaoDanh() == sbd) {
				thiSinh.hienThiThongTin();
				sbdFound++;
			}
		}
		if (sbdFound == 0) {
			System.out.println("Khong tim thay thi sinh co so bao danh " + sbd);
		}

	}
}
