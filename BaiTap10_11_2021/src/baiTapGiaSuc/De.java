package baiTapGiaSuc;

public class De extends GiaSuc {
	public De() {
		this.tiengKeu = "Deeeeeeeee";
	}

	@Override
	public int sinhCon() {
		return super.sinhCon();
	}

	@Override
	public int choSua() {
		return (int) (Math.random() * 10);
	}
}
