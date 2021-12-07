package baiTapGiaSuc;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		GiaSuc bo, cuu, de;
		bo = new Bo();
		cuu = new Cuu();
		de = new De();
		Scanner sc = new Scanner(System.in);
		bo.setSoLuong(GiaSuc.ExceptionSoLuong(sc, "Bo"), "Bo");
		cuu.setSoLuong(GiaSuc.ExceptionSoLuong(sc, "Cuu"), "Cuu");
		de.setSoLuong(GiaSuc.ExceptionSoLuong(sc, "De"), "De");
		System.out.println("---------------------------");
		if (bo.getSoLuong() > 0) {
			System.out.println("Tieng bo keu doi: " + bo.tiengKeu);
		}
		if (cuu.getSoLuong() > 0) {
			System.out.println("Tieng cuu keu doi: " + cuu.tiengKeu);
		}
		if (de.getSoLuong() > 0) {
			System.out.println("Tieng de keu doi: " + de.tiengKeu);
		}
		System.out.println("---------------------------");
		System.out.println("So luong bo con duoc sinh ra: " + slCon(bo.getSoLuong(), bo));
		System.out.println("So luong cuu con duoc sinh ra: " + slCon(cuu.getSoLuong(), cuu));
		System.out.println("So luong de con duoc sinh ra: " + slCon(de.getSoLuong(), de));

		System.out.println("----------------------------");
		System.out.println("So lit sua ma bo cho sau 1 luot: " + slSua(bo.getSoLuong(), bo));
		System.out.println("So lit sua ma cuu cho sau 1 luot: " + slSua(cuu.getSoLuong(), cuu));
		System.out.println("So lit sua ma de cho sau 1 luot: " + slSua(de.getSoLuong(), de));
	}

	public static int slCon(int slMe, GiaSuc giaSuc) {
		int sum = 0;
		for (int i = 1; i <= slMe; i++) {
			sum += giaSuc.sinhCon();
		}
		return sum;
	}

	public static int slSua(int slMe, GiaSuc giaSuc) {
		int sum = 0;
		for (int i = 1; i <= slMe; i++) {
			sum += giaSuc.choSua();
		}
		return sum;
	}

}
