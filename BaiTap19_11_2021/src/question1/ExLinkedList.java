package question1;

import java.util.LinkedList;

public class ExLinkedList {
	public static void main(String[] args) {
		LinkedList<String> personName = new LinkedList<>();
		personName.add("An");
		personName.add("Binh");
		personName.add("Hoai");
		personName.add("Thu");
		personName.add("Nga");
		System.out.println("Fisrt element: " + personName.getFirst());
		System.out.println("Last element: " + personName.getLast());
	}
}
