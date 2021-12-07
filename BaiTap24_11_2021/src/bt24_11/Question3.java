package bt24_11;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

class DirFilter implements FilenameFilter {
	String pathDir;

	public DirFilter(String pathDir) {
		this.pathDir = pathDir;
	}

	@Override
	public boolean accept(File dir, String name) {
		return new File(dir, name).isDirectory();
	}

}

public class Question3 {
	public static void main(String[] args) {
		String pathDir = "C:/";
		File dir = new File(pathDir);
		DirFilter dirFilter = new DirFilter(pathDir);
		String[] listDir = dir.list(dirFilter);
		System.out.println("List of directory in " + pathDir + " is:  "
				+ Arrays.toString(listDir).replace("[", "").replace("]", ""));
	}
}
