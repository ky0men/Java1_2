package baiTapTrenLop01;

public class CheckInput {
	public static int checkInput(int n) throws EqualZero, LessThanTen, LessThanZero {
		if (n == 0) {
			throw new EqualZero();
		} else if (n < 0) {
			throw new LessThanZero();
		} else if (n < 10) {
			throw new LessThanTen();
		} else {
			return n;
		}
	}
}
