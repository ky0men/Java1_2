package baiTapTrenLop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private byte tuoi;
	private String gioiTinh;
	private String diaChi;
	protected String chucVu;

	public CanBo() {

	}

	public CanBo(String hoTen, byte tuoi, String gioiTinh, String diaChi, String chucVu) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
//		this.chucVu = chucVu;
	}

	public void themMoi(Scanner sc) {
		System.out.print("Nhap ho ten NV: ");
		this.hoTen = sc.nextLine();
		setTuoi(ExceptionTuoi(sc));
		System.out.print("Nhap gioi tinh: ");
		setGioiTinh(sc.nextLine());
		System.out.print("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
	}

	public void xuatThongTin() {
		System.out.print("\nHo va Ten: " + this.getHoTen() + ", Tuoi: " + this.getTuoi() + ", Gioi Tinh: "
				+ this.getGioiTinh() + ", Dia Chi: " + this.getDiaChi() + ", Chuc vu: " + this.getChucVu());
	}

	public static byte ExceptionTuoi(Scanner sc) {
		while (true) {
			byte tuoi;
			try {
				System.out.print("Nhap tuoi NV: ");
				tuoi = sc.nextByte();
				sc.nextLine();
				return tuoi;
			} catch (InputMismatchException e) {
				System.out.println("Tuoi khong hop le. Nhap lai!");
				sc.nextLine();
			}
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public byte getTuoi() {
		return tuoi;
	}

	public void setTuoi(byte tuoi) {
		if (tuoi >= 18) {
			this.tuoi = tuoi;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ban chua du tuoi lao dong!");
			setTuoi(ExceptionTuoi(sc));
		}
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		switch (gioiTinh.toLowerCase()) {
		case "nam":
			this.gioiTinh = "Nam";
			break;
		case "nu":
			this.gioiTinh = "Nu";
			break;
		default:
			this.gioiTinh = "Khac";
			break;
		}
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

}
