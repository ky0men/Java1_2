package bt24_11;

import java.io.File;

public class Question1 {
	public static void main(String[] args) {
		File file = new File("Test.txt");
		if (file.exists()) {
			System.out.println("Path is: " + file.getPath());
			System.out.println("Name is: " + file.getName());
		} else {
			System.out.println("File is not exist!");
		}
	}
}
