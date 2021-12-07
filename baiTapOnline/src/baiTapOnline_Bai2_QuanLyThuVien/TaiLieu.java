package baiTapOnline_Bai2_QuanLyThuVien;

import java.util.Scanner;

public class TaiLieu {
	private int maTaiLieu;
	private String tenNhaXuatBan;
	private int soBanPhatHanh;
	protected String loaiTaiLieu;

	public TaiLieu() {

	}

	public TaiLieu(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String loaiTaiLieu) {
		this.maTaiLieu = maTaiLieu;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
		this.loaiTaiLieu = loaiTaiLieu;
	}

	public void themMoi(Scanner sc) {
		this.setMaTaiLieu(ExceptionMaTaiLieu(sc));
		System.out.print("Nhap ten xuat ban: ");
		this.tenNhaXuatBan = sc.nextLine();
		setSoBanPhatHanh(ExceptionSoBanPhatHanh(sc));

	}

	public void xuatThongTin() {
		System.out.print("\nMa tai lieu: " + this.getMaTaiLieu() + ", NXB: " + this.getTenNhaXuatBan()
				+ ", So ban phat hanh: " + this.getSoBanPhatHanh() + ", Loai: " + this.getLoaiTaiLieu());
	}

	public static int ExceptionMaTaiLieu(Scanner sc) {
		while (true) {
			int ma;
			try {
				System.out.print("Nhap ma tai lieu: ");
				ma = sc.nextInt();
				sc.nextLine();
				return ma;
			} catch (Exception e) {
				System.out.println("Ma tai lieu khong hop le. Nhap lai!");
				sc.nextLine();
			}
		}
	}

	public static int ExceptionSoBanPhatHanh(Scanner sc) {
		while (true) {
			int sbph;
			try {
				System.out.print("Nhap so ban phat hanh: ");
				sbph = sc.nextInt();
				sc.nextLine();
				return sbph;
			} catch (Exception e) {
				System.out.println("So ban phat hanh phai la so. Nhap lai!");
				sc.nextLine();
			}
		}
	}

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public String getLoaiTaiLieu() {
		return loaiTaiLieu;
	}

	public void setLoaiTaiLieu(String loaiTaiLieu) {
		this.loaiTaiLieu = loaiTaiLieu;
	}

}
