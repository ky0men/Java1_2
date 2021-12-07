package baiTapGiaSuc;

public class Cuu extends GiaSuc {
	public Cuu() {
		this.tiengKeu = "Cuuuuuuuuuuu";
	}

	@Override
	public int sinhCon() {
		return super.sinhCon();
	}

	@Override
	public int choSua() {
		return (int) (Math.random() * 5);
	}
}
