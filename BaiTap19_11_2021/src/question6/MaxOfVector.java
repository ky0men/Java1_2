package question6;

import java.util.Collections;
import java.util.Vector;

public class MaxOfVector {
	public static void main(String[] args) {
		Vector<Double> vectorD = new Vector<>();
		vectorD.add(34.98);
		vectorD.add(26.43);
		vectorD.add(38.52);
		vectorD.add(76.23);
		vectorD.add(23.01);
		vectorD.add(98.67);
		Object maxOfVec = Collections.max(vectorD);
		System.out.println("Max element of vector is: " + maxOfVec);
	}
}
