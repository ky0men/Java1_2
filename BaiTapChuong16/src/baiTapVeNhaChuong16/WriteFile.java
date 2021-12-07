package baiTapVeNhaChuong16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteFile {
	public static void clearFileContent(String url) throws IOException {
		FileWriter writer = new FileWriter(url);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write("");
		bufferedWriter.close();
	}

	public static void writeRollNumber(String line, String url) throws IOException {
		File file = new File(url);
		OutputStream outputStream = new FileOutputStream(file, true);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		outputStreamWriter.write(line);
		outputStreamWriter.write("\n");
		outputStreamWriter.flush();
		outputStream.close();
	}
}
