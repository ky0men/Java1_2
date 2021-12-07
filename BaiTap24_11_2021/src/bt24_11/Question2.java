package bt24_11;

import java.io.File;

public class Question2 {
	public static void main(String[] args) {
		File[] rootDir = File.listRoots();
		System.out.println("Root directories in your system are: ");
		for (File file : rootDir) {
			System.out.println(file.toString());
		}
	}
}
