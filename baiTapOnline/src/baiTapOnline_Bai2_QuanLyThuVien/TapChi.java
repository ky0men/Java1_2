package baiTapOnline_Bai2_QuanLyThuVien;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapChi() {
		this.loaiTaiLieu = "Tap Chi";
	}

	public TapChi(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, "Tap chi");
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public void themMoi(Scanner sc) {
		super.themMoi(sc);
		setSoPhatHanh(ExceptionSoPhatHanh(sc));
		setThangPhatHanh(ExceptionThangPhatHanh(sc));
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print(", So phat hanh: " + this.getSoPhatHanh() + ", Thang phat hanh: " + this.getThangPhatHanh());
	}

	public static int ExceptionSoPhatHanh(Scanner sc) {
		while (true) {
			int soPhatHanh;
			try {
				System.out.print("Nhap so phat hanh: ");
				soPhatHanh = sc.nextInt();
				sc.nextLine();
				return soPhatHanh;
			} catch (Exception e) {
				System.out.println("So phat hanh khong hop le. Nhap lai!");
				sc.nextLine();
			}
		}
	}

	public static int ExceptionThangPhatHanh(Scanner sc) {
		while (true) {
			int thangPhatHanh;
			try {
				System.out.print("Nhap thang phat hanh: ");
				thangPhatHanh = sc.nextInt();
				sc.nextLine();
				return thangPhatHanh;
			} catch (Exception e) {
				System.out.println("Thang phat hanh khong hop le: ");
				sc.nextLine();
			}
		}

	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		if (thangPhatHanh >= 1 && thangPhatHanh <= 12) {
			this.thangPhatHanh = thangPhatHanh;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Thang phat hanh phai 1 - 12. Nhap lai!");
			ExceptionThangPhatHanh(sc);
		}
	}

}
