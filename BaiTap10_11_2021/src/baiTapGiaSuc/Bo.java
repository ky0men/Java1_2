package baiTapGiaSuc;

public class Bo extends GiaSuc {

	public Bo() {
		this.tiengKeu = "Boooooo";
	}

	@Override
	public int sinhCon() {
		return super.sinhCon();
	}

	@Override
	public int choSua() {
		return (int) (Math.random() * 20);
	}
}
