package bt24_11;

import java.io.File;
import java.util.Arrays;

class FileTxtFilter extends FileFilter {

	public FileTxtFilter(String fileExt) {
		super(fileExt);
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(fileExt);
	}

}

public class Question5 {
	public static void main(String[] args) {
		String pathDir = "C:/";
		File dir = new File(pathDir);
		FileTxtFilter txtFilter = new FileTxtFilter("txt");
		String[] txtArr = dir.list(txtFilter);
		System.out.println(
				"File txt in " + pathDir + " is: " + Arrays.toString(txtArr).replace("[", "").replace("]", ""));
	}
}
