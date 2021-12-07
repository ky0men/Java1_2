package baiTap29_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Question3 {
	public static void main(String[] args) throws IOException {
		// Compress
		try {
			FileInputStream fis = new FileInputStream("inzip.txt");
			FileOutputStream fos = new FileOutputStream("inzip.dfl");
			DeflaterOutputStream zipWrite = new DeflaterOutputStream(fos);
			int read = 0;
			while ((read = fis.read()) != -1) {
				zipWrite.write(read);
			}
			zipWrite.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Decompress
		FileOutputStream foutWrite = new FileOutputStream("outzip.txt");
		FileInputStream fread = new FileInputStream("inzip.dfl");
		InflaterInputStream defRead = new InflaterInputStream(fread);
		int outRead = 0;
		while ((outRead = defRead.read()) != -1) {
			foutWrite.write(outRead);
		}
		foutWrite.close();
		defRead.close();
		System.out.println("Compress and decompress successfully. Please check inzip.txt and outzip.txt");
	}
}
