package baiTapOnline_Bai2_QuanLyThuVien;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;

	public Sach() {
		this.loaiTaiLieu = "Sach";
	}

	public Sach(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, "Sach");
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	@Override
	public void themMoi(Scanner sc) {
		super.themMoi(sc);
		System.out.print("Nhap ten tac gia: ");
		this.tenTacGia = sc.nextLine();
		setSoTrang(ExceptionSoTrang(sc));
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print(", Ten tac gia: " + this.getTenTacGia() + ", So trang: " + this.getSoTrang());
	}

	public static int ExceptionSoTrang(Scanner sc) {
		while (true) {
			int st;
			try {
				System.out.print("Nhap so trang sach: ");
				st = sc.nextInt();
				sc.nextLine();
				return st;
			} catch (Exception e) {
				System.out.println("So trang khong hop le. Nhap lai!");
				sc.nextLine();
			}
		}
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

}
