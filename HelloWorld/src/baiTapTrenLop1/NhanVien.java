package baiTapTrenLop1;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien() {
		this.chucVu = "Nhan Vien";
	}

	public NhanVien(String hoTen, byte tuoi, String gioiTinh, String diaChi, String chucVu, String congViec) {
		super();
		this.congViec = congViec;
	}

	public void themMoi(Scanner sc) {
		super.themMoi(sc);
		System.out.print("Nhap cong viec: ");
		this.congViec = sc.nextLine();
	}

	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print(", Cong viec: " + this.getCongViec());
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

}
