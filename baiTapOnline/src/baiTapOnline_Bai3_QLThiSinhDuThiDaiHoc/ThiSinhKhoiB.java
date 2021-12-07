package baiTapOnline_Bai3_QLThiSinhDuThiDaiHoc;

import java.util.Scanner;

public class ThiSinhKhoiB extends ThiSinh {
	public ThiSinhKhoiB() {
		this.khoiThi = "B";
	}

	public ThiSinhKhoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, String khoiThi) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien, khoiThi);
	}

	@Override
	public void themMoi(Scanner sc) {
		super.themMoi(sc);
	}

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println(", Khoi thi: " + khoiThi + ", Mon thi: Toan, Hoa, Sinh");
	}
}
