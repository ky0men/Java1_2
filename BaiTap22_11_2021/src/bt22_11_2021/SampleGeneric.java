package bt22_11_2021;

import java.util.ArrayList;

public class SampleGeneric<E> {
	ArrayList<E> list = new ArrayList<>();

	public SampleGeneric() {

	}

	public void add(E e) {
		list.add(e);
	}

	public E get(int index) {
		return list.get(index);
	}
}
