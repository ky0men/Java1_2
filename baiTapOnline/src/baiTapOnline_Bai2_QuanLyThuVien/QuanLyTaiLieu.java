package baiTapOnline_Bai2_QuanLyThuVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTaiLieu {
	private ArrayList<TaiLieu> tl = new ArrayList<>();

	public void themMoi() {
		Scanner sc = new Scanner(System.in);
		byte choice;
		do {
			System.out.println("============ Them Moi Tai Lieu ===============");
			System.out.println("Chon loai tai lieu can them moi");
			System.out.println("1. Sach");
			System.out.println("2. Tap chi");
			System.out.println("3. Bao");
			System.out.println("4. Thoat");
			choice = ExceptionChoice(sc);
			if (choice == 4) {
				break;
			} else if (choice == 1 || choice == 2 || choice == 3) {
				switch (choice) {
				case 1:
					Sach sach = new Sach();
					sach.themMoi(sc);
					tl.add(sach);
					break;
				case 2:
					TapChi tapChi = new TapChi();
					tapChi.themMoi(sc);
					tl.add(tapChi);
					break;
				case 3:
					Bao bao = new Bao();
					bao.themMoi(sc);
					tl.add(bao);
					break;
				}
			}
		} while (true);
	}

	public void xuatThongTin() {
		System.out.println("------------- Thong tin tai lieu ----------------");
		for (TaiLieu taiLieu : tl) {
			if (taiLieu instanceof Sach) {
				((Sach) taiLieu).xuatThongTin();
			} else if (taiLieu instanceof TapChi) {
				((TapChi) taiLieu).xuatThongTin();
			} else if (taiLieu instanceof Bao) {
				((Bao) taiLieu).xuatThongTin();
			}
		}
	}

	public void xoaTaiLieuTheoMa(Scanner sc) {
		System.out.println("------- Xoa tai lieu ----------");
		System.out.print("Nhap ma tai lieu can xoa: ");
		String ma = sc.nextLine();
		TaiLieu DeleteTaiLieu = null;
		for (TaiLieu taiLieu : tl) {
			if (taiLieu.getMaTaiLieu() == Integer.parseInt(ma)) {
				DeleteTaiLieu = taiLieu;
			}
		}
		if (DeleteTaiLieu != null) {
			tl.remove(DeleteTaiLieu);
			System.out.println("Tai lieu da duoc xoa!");
		} else {
			System.out.println("Khong tim thay tai lieu ma " + ma + " trong danh sanh");
		}
	}

	public void timTheoLoaiTaiLieu(Scanner sc) {
		byte choice;
		do {
			ArrayList<TaiLieu> timTaiLieu = new ArrayList<>();
			System.out.println("\n------------ Tim kiem tai lieu --------------");
			System.out.println("Nhap loai tai lieu can tim kiem");
			System.out.println("1. Tim Sach");
			System.out.println("2. Tim tap chi");
			System.out.println("3. Tim bao");
			System.out.println("4. Thoat");
			choice = ExceptionChoice(sc);
			if (choice == 4) {
				break;
			} else if (choice == 1 || choice == 2 || choice == 3) {
				switch (choice) {
				case 1:
					for (TaiLieu taiLieu : tl) {
						if (taiLieu instanceof Sach) {
							timTaiLieu.add(taiLieu);
						}
					}
					if (timTaiLieu.size() == 0) {
						System.out.println("Khong tim thay tai lieu loai Sach");
					} else {
						System.out.println("----- Sach duoc tim thay -----");
						for (TaiLieu taiLieu : timTaiLieu) {
							((Sach) taiLieu).xuatThongTin();
						}
					}
					break;
				case 2:
					for (TaiLieu taiLieu : tl) {
						if (taiLieu instanceof TapChi) {
							timTaiLieu.add(taiLieu);
						}
					}
					if (timTaiLieu.size() == 0) {
						System.out.println("Khong tim thay tai lieu loai Tap Chi");
					} else {
						System.out.println("----- Tap chi duoc tim thay -----");
						for (TaiLieu taiLieu : timTaiLieu) {
							((TapChi) taiLieu).xuatThongTin();
						}
					}
					break;
				case 3:
					for (TaiLieu taiLieu : tl) {
						if (taiLieu instanceof Bao) {
							timTaiLieu.add(taiLieu);
						}
					}
					if (timTaiLieu.size() == 0) {
						System.out.println("Khong tim thay tai lieu loai Bao");
					} else {
						System.out.println("----- Bao duoc tim thay -----");
						for (TaiLieu taiLieu : timTaiLieu) {
							((Bao) taiLieu).xuatThongTin();
						}
					}
					break;
				}
			}

		} while (true);
	}

	public static byte ExceptionChoice(Scanner sc) {
		while (true) {
			byte choice;
			try {
				System.out.print("Lua chon: ");
				choice = sc.nextByte();
				sc.nextLine();
				return choice;
			} catch (Exception e) {
				System.out.println("Lua chon khong hop le. Nhap lai!");
				sc.nextLine();
			}

		}
	}

}
