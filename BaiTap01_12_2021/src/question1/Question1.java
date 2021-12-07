package question1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question1 {
	public static int rand1() {
		int rand = (int) Math.floor(Math.random() * (91) + 10);
		return rand;
	}

	public static int rand2() {
		int rand = (int) Math.floor(Math.random() * (500) + 1);
		return rand;
	}

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {

			fos = new FileOutputStream("number.txt");
			bos = new BufferedOutputStream(fos);
			int n = rand1();
			String line1 = new String("Number generate: " + n + "\n");
			bos.write(line1.getBytes());
			for (int i = 0; i < n; i++) {
				String num = new String(rand2() + "\n");
				bos.write(num.getBytes());
			}
			System.out.println("Write successfully. Please check file number.txt.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				bos.close();
			}
		}
	}
}
