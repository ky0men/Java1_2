package baiTapTrenLop1;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public KySu() {
		this.chucVu = "Ky Su";
	}

	public KySu(String hoTen, byte tuoi, String gioiTinh, String diaChi, String chucVu, String nganhDaoTao) {
		super();
		this.nganhDaoTao = nganhDaoTao;
	}

	public void themMoi(Scanner sc) {
		super.themMoi(sc);
		System.out.print("Nhap nganh dao tao: ");
		this.nganhDaoTao = sc.nextLine();
	}

	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print(", Nganh dao tao: " + this.getNganhDaoTao());
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
}
