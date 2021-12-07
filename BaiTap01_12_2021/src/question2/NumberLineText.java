package question2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberLineText {
	public static int countLine() {
		FileReader fread = null;
		BufferedReader bread = null;
		int numberLine = 0;
		try {
			fread = new FileReader("number.txt");
			bread = new BufferedReader(fread);
			while ((bread.readLine()) != null) {
				numberLine++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return numberLine;
	}

}
