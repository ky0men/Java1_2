package baiTapVeNhaChuong16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readFile {
	public void readStudentRollNumber() {
		String fileUrl = "students.txt";
		FileInputStream fileInputStream = null;
		BufferedReader bufferedReader = null;
		try {
			WriteFile.clearFileContent("validRollNumber.txt");
			WriteFile.clearFileContent("invalidRollNumber.txt");
			fileInputStream = new FileInputStream(fileUrl);
			bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String line = bufferedReader.readLine();
			while (line != null) {
				if (line.matches("\\b['C''T''N']{1}[0-9]{4}['G''H''K''I''L''M']{1}V?[0-9]{4}\\b")) {
					WriteFile.writeRollNumber(line, "validRollNumber.txt");
					System.out.println("\nWelcome student has roll number is: " + line);
					System.out.println("Valid collection has lenghth: " + readAndCount("validRollNumber.txt"));
				} else {
					System.out.println("\nInvalid roll number: " + line);
					WriteFile.writeRollNumber(line, "invalidRollNumber.txt");
				}
				line = bufferedReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int readAndCount(String url) throws IOException {
		int count = 0;
		File file = new File(url);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		try {
			while (line != null) {
				count++;
				line = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reader.close();

		}
		return count;
	}

}
