package bt24_11;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

class FileFilter implements FilenameFilter {
	String fileExt;

	public FileFilter(String fileExt) {
		this.fileExt = "." + fileExt;
	}

	@Override
	public boolean accept(File dir, String name) {
		return new File(dir, name).isFile();
	}

}

public class Question4 {
	public static void main(String[] args) {
		String pathDir = "C:/";
		File dir = new File(pathDir);
		DirFilter dirFilter = new DirFilter(pathDir);
		String[] listDir = dir.list(dirFilter);
		FileFilter fileFilter = new FileFilter(pathDir);
		String[] listFile = dir.list(fileFilter);
		System.out.println("List of directory in " + pathDir + " is:  "
				+ Arrays.toString(listDir).replace("[", "").replace("]", ""));
		System.out.println(
				"List of file in " + pathDir + " is: " + Arrays.toString(listFile).replace("[", "").replace("]", ""));
		System.out.println("------------------------------------------------");
		for (String childrenDir : listDir) {
			File chilDir = new File(pathDir + "/" + childrenDir);
			DirFilter chilDirFilter = new DirFilter(pathDir + "/" + childrenDir);
			String[] listChilDir = chilDir.list(chilDirFilter);
			FileFilter fileChilFilter = new FileFilter(pathDir + "/" + childrenDir);
			String[] listChilFile = dir.list(fileChilFilter);
			System.out.println("List of children directory in " + chilDir + " is: "
					+ Arrays.toString(listChilDir).replace("[", "").replace("]", ""));
			System.out.println("List of children file in " + chilDir + " is: "
					+ Arrays.toString(listChilFile).replace("[", "").replace("]", ""));
			System.out.println("------------------------------------------------");
		}
	}
	/// Users/phudien/Downloads
}
