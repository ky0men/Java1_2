package baiTapOnline_Bai2_QuanLyThuVien;

import java.util.Scanner;

public class Bao extends TaiLieu {
	private int ngayPhatHanh;

	public Bao() {
		this.loaiTaiLieu = "Bao";
	}

	public Bao(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, "Bao");
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public void themMoi(Scanner sc) {
		super.themMoi(sc);
		setNgayPhatHanh(ExceptionNgayPhatHanh(sc));
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print(", Ngay phat hanh: " + this.getNgayPhatHanh());
	}

	public static int ExceptionNgayPhatHanh(Scanner sc) {
		while (true) {
			int nph;
			try {
				System.out.print("Nhap ngay phat hanh: ");
				nph = sc.nextInt();
				sc.nextLine();
				return nph;
			} catch (Exception e) {
				System.out.println("Ngay phat hanh khong hop le. Nhap lai!");
				sc.nextLine();
			}
		}
	}

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		if (ngayPhatHanh >= 1 && ngayPhatHanh <= 31) {
			this.ngayPhatHanh = ngayPhatHanh;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ngay phat hanh phai tu 1 - 31. Nhap lai!");
			setNgayPhatHanh(ExceptionNgayPhatHanh(sc));
		}
	}

}
