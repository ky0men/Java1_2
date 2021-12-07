package baiTapGiaSuc;

import java.util.Scanner;

public class GiaSuc {
	protected String tiengKeu;
	private int soLuong;

	public GiaSuc() {

	}

	public int sinhCon() {
		return (int) Math.round(Math.random());
	}

	public int choSua() {
		return 0;
	}

	public String getTiengKeu() {
		return tiengKeu;
	}

	public void setTiengKeu(String tiengKeu) {
		this.tiengKeu = tiengKeu;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong, String loaiGiaSuc) {
		if (soLuong >= 0) {
			this.soLuong = soLuong;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("So luong khong hop le. Nhap lai!");
			this.setSoLuong(ExceptionSoLuong(sc, loaiGiaSuc), loaiGiaSuc);
		}
	}

	public static int ExceptionSoLuong(Scanner sc, String loaiGiaSuc) {
		while (true) {
			int sl;
			try {
				System.out.print("Nhap so luong " + loaiGiaSuc + ": ");
				sl = sc.nextInt();
				sc.nextLine();
				return sl;
			} catch (Exception e) {
				System.out.println("So luong khong hop le. Nhap lai!");
				sc.nextLine();
			}
		}
	}

}
