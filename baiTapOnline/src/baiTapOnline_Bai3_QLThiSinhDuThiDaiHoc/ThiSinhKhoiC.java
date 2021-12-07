package baiTapOnline_Bai3_QLThiSinhDuThiDaiHoc;

import java.util.Scanner;

public class ThiSinhKhoiC extends ThiSinh {
	public ThiSinhKhoiC() {
		this.khoiThi = "C";
	}

	public ThiSinhKhoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, String khoiThi) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien, khoiThi);
	}

	@Override
	public void themMoi(Scanner sc) {
		super.themMoi(sc);
	}

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println(", Kho thi: " + khoiThi + ", Mon thi: Van, Su, Dia");
	}
}
