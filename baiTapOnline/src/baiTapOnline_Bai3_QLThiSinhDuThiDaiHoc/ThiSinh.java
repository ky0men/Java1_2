package baiTapOnline_Bai3_QLThiSinhDuThiDaiHoc;

import java.util.Scanner;

public class ThiSinh {
	private int soBaoDanh;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	protected String khoiThi;

	public ThiSinh() {

	}

	public ThiSinh(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, String khoiThi) {
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoiThi = khoiThi;
	}

	public void themMoi(Scanner sc) {
		setSoBaoDanh(ExceptionInteger(sc, "So bao danh"));
		System.out.print("Nhap ho va ten: ");
		this.hoTen = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
		setMucUuTien(ExceptionInteger(sc, "Muc uu tien"));
	}

	public void hienThiThongTin() {
		System.out.print("So bao danh: " + soBaoDanh + ", Ho va Ten: " + hoTen + ", Dia Chi: " + diaChi
				+ ", Muc uu tien: " + mucUuTien);
	}

	public static int ExceptionInteger(Scanner sc, String type) {
		int intNum;
		while (true) {
			try {
				System.out.print("Nhap " + type + ": ");
				intNum = sc.nextInt();
				sc.nextLine();
				return intNum;
			} catch (Exception e) {
				System.out.println(type + " khong hop le. Nhap lai!");
				sc.nextLine();
			}

		}
	}

	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}

	public String getKhoiThi() {
		return khoiThi;
	}

	public void setKhoiThi(String khoiThi) {
		this.khoiThi = khoiThi;
	}

}
