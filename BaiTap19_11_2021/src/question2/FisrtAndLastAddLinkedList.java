package question2;

import java.util.LinkedList;

public class FisrtAndLastAddLinkedList {
	public static void main(String[] args) {
		LinkedList<String> programingCourse = new LinkedList<>();
		programingCourse.add("Java");
		programingCourse.add("C#");
		System.out.println(programingCourse);
		System.out.println("After add firt and add last element");
		programingCourse.addFirst("Java Script");
		programingCourse.addLast("PHP");
		System.out.println(programingCourse);
	}
}
